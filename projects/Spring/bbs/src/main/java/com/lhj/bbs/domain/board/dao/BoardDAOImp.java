package com.lhj.bbs.domain.board.dao;

import com.lhj.bbs.domain.entity.Board;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

//다양한 로깅 프레임워크를 추상화하여 동일한 방식으로 접근하게 함
@Slf4j

// 데이터 접근 계층 ( DAO ) 을 나타낼 때 사용됨
// @Repository가 적용된 클래스는 데이터베이스와 상호작용하며 CRUD( Create, Read, Update, Delete )할 수 있는 메서드를 정의
@Repository

// 생성자를 자동으로 생성
@RequiredArgsConstructor
public class BoardDAOImp implements BoardDAO{


//  NamedParameterJdbcTemplate는 sql 쿼리문에서 이름을 지정하여 파라미터를 매핑할 수 있게함
//  ex) where id = :parameter
//  JdbcTemplate는
//  ex) where id = ?
  private final NamedParameterJdbcTemplate template;


  // 매핑
  RowMapper<Board> boardRowMapper() {
    return (rs, rowNum) -> {   // 람다 표현식으로 RowMapper 구현
      Board board = new Board();  // 새 Board 객체 생성

      // ResultSet에서 데이터를 추출하여 Board 객체의 속성에 설정
      board.setBoardId(rs.getLong("board_id"));  // board_id 컬럼 값을 long 타입으로 가져와 Board 객체에 설정
      board.setBoardTitle(rs.getString("board_title"));  // board_title 컬럼 값을 String 타입으로 가져와 Board 객체에 설정
      board.setBoardContent(rs.getString("board_content"));  // board_content 컬럼 값을 String 타입으로 가져와 Board 객체에 설정
      board.setBoardWriter(rs.getString("board_writer"));  // board_writer 컬럼 값을 String 타입으로 가져와 Board 객체에 설정
      board.setBoardDate(rs.getTimestamp("board_date"));  // board_date 컬럼 값을 Timestamp 타입으로 가져와 Board 객체에 설정
      board.setBoardUpdate(rs.getTimestamp("board_update"));  // board_update 컬럼 값을 Timestamp 타입으로 가져와 Board 객체에 설정

      return board;  // Board 객체 반환
    };
  }


//  (C)reate
  @Override
  public Long save(Board board) {
//    sql 쿼리를 StringBuffer에 담기
    StringBuffer sql = new StringBuffer();
    sql.append("insert into Board( board_id, user_id, board_title, board_content, board_writer, board_date ) ");
    sql.append("values( board_id_seq.nextval, :userId, :boardTitle, :boardContent , :boardWriter , sysdate ) ");

    SqlParameterSource sqlParam = new BeanPropertySqlParameterSource(board);

    KeyHolder keyHolder = new GeneratedKeyHolder();
    template.update(sql.toString(), sqlParam, keyHolder, new String[]{"board_id"});

    Number bidNumber = (Number) keyHolder.getKeys().get("board_id");
    long bid = bidNumber.longValue();

    return bid;
  }


  //  (R)ead
//  단건조회
  @Override
  public Optional<Board> findById(Long boardId) {
//    StringBuffer 객체에 sql 쿼리문 추가
    StringBuffer sql = new StringBuffer();
    sql.append("select board_id, user_id, board_title, board_content, board_writer, board_date, board_update ");
    sql.append("from board ");
    sql.append("where board_id = :boardId ");

//
    SqlParameterSource sqlParam = new MapSqlParameterSource()
              .addValue("boardId", boardId);

    Board board = null;

    try{
      board = template.queryForObject(
          sql.toString(),
          sqlParam,
          BeanPropertyRowMapper.newInstance(Board.class));
    } catch (EmptyResultDataAccessException e) {
      return Optional.empty();
    }

    return Optional.of(board);
  }

//  전체 조회
  @Override
  public List<Board> findAll() {
//    1. SQL문 작성
    StringBuffer sql = new StringBuffer();
    sql.append("select board_id, user_id,board_title, board_content, board_writer, board_date, board_update ");
    sql.append("from board ");

//
    List<Board> list = template.query(sql.toString(), boardRowMapper());

    return list;
  }

  //  (U)pdate
//  수정
  @Override
  public int updateById(Long boardId, Board board) {
    StringBuffer sql = new StringBuffer();
    sql.append("update board ");
    sql.append("set board_title = :boardTitle, board_content = :boardContent, board_writer = :boardWriter, board_update = sysdate ");
    sql.append("where board_id = :boardId ");

    SqlParameterSource sqlParam = new MapSqlParameterSource()
        .addValue("boardTitle", board.getBoardTitle())
        .addValue("boardContent", board.getBoardContent())
        .addValue("boardWriter", board.getBoardWriter())
        .addValue("boardId", boardId);

    int rows = template.update(sql.toString(), sqlParam);

    return rows;
  }

  //  (D)elete
//  단건삭제
  @Override
  public int deleteById(Long boardId) {
    StringBuffer sql = new StringBuffer();
    sql.append("delete from board ");
    sql.append("where board_id = :boardId ");

    Map<String, Long> param = Map.of("boardId", boardId);
    int rows = template.update(sql.toString(), param);

    return rows;
  }

//  여러건 삭제
  @Override
  public int deleteByIds(List<Long> boardIds) {
    StringBuffer sql = new StringBuffer();
    sql.append("delete from board ");
    sql.append("where board_id in (:boardIds) ");

    Map<String, List<Long>> param = Map.of("boardIds", boardIds);
    int rows = template.update(sql.toString(), param);

    return rows;
  }
}
