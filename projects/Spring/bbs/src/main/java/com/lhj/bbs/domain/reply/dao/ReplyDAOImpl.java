package com.lhj.bbs.domain.reply.dao;

import com.lhj.bbs.domain.entity.Reply;
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
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class ReplyDAOImpl implements ReplyDAO{

  private final NamedParameterJdbcTemplate template;

//
  RowMapper<Reply> replyRowMapper() {
//    rs ( Result Set ) - 쿼리에 대한 결과
//    rowNum ( row Number ) - 현재 처리되는 행이 몇번째인지 나타내는 인덱스
    return (rs, rowNum) -> {
//      객체 생성
      Reply reply = new Reply();

//      데이터를 추출하고 reply 객체에 설정
      reply.setReplyId(rs.getLong("reply_id"));
      reply.setBoardId(rs.getLong("board_id"));
      reply.setUserId(rs.getLong("user_id"));
      reply.setReplyWriter(rs.getString("reply_writer"));
      reply.setReplyContent(rs.getString("reply_content"));
      reply.setCreateDate(rs.getTimestamp("create_date"));
      reply.setUpdateDate(rs.getTimestamp("update_date"));

      return reply;
    };
  }

//  Create
  @Override
  public Long add(Reply reply) {
    StringBuffer sql = new StringBuffer();
    sql.append("insert into reply(reply_id, board_id, user_id, reply_writer, reply_content, create_date) ");
    sql.append("values (reply_id_seq.nextval, :boardId, :userId, :replyWriter, :replyContent, sysdate) ");

    SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(reply);

    KeyHolder keyHolder = new GeneratedKeyHolder();
    template.update(sql.toString(), sqlParameterSource, keyHolder, new String[]{"reply_id"});

    Number repidNumber = (Number)keyHolder.getKeys().get("reply_id");
    long repid = repidNumber.longValue();

    return repid;
  }

  @Override
  public int updateById(Long replyId, Reply reply) {
//    StringBuffer 객체에 sql 쿼리문 추가
    StringBuffer sql = new StringBuffer();
    sql.append("update reply ");
    sql.append("set reply_writer = :replyWriter, reply_content = :replyContent, update_date = sysdate ");
    sql.append("where reply_id = :replyId ");

//    sql 파라미터 값 설정
    SqlParameterSource sqlParamSrc = new MapSqlParameterSource()
        .addValue("replyWriter", reply.getReplyWriter())
        .addValue("replyContent", reply.getReplyContent())
        .addValue("replyId", replyId);

    int updateRow = template.update(sql.toString(), sqlParamSrc);

    return updateRow;
  }

  @Override
  public int deleteById(Long replyId) {
    StringBuffer sql = new StringBuffer();
    sql.append("delete from reply ");
    sql.append("where reply_id = :replyId ");

    Map<String, Long> mapRepId = Map.of("replyId", replyId);
    int deleteRep = template.update(sql.toString(), mapRepId);

    return deleteRep;
  }

  @Override
  public int deleteByIds(List<Long> replyIds) {
    StringBuffer sql = new StringBuffer();
    sql.append("delete from reply ");
    sql.append("where reply_id in (:replyIds) ");

    Map<String, List<Long>> mapReplyIds = Map.of("replyIds", replyIds);
    int deleteReplys = template.update(sql.toString(), mapReplyIds);

    return deleteReplys;
  }

  @Override
  public List<Reply> listAll() {
    StringBuffer sql = new StringBuffer();
    sql.append("select reply_id, board_id, user_id, reply_writer, reply_content, create_date, update_date ");
    sql.append("from reply ");

    List<Reply> replyList = template.query(sql.toString(), replyRowMapper());

    return replyList;
  }

  @Override
  public List<Reply> listAll(Long boardId) {
    StringBuffer sql = new StringBuffer();
    sql.append("select reply_id, board_id, user_id, reply_writer, reply_content, create_date, update_date ");
    sql.append("from reply ");
    sql.append("where board_id = :boardId ");

    SqlParameterSource param = new MapSqlParameterSource("boardId",boardId);

    List<Reply> replyList = template.query(sql.toString(), param, replyRowMapper());

    return replyList;
  }

  @Override
  public List<Reply> findAll(int reqPage, int reqRec, Long boardId) {
    StringBuffer sql = new StringBuffer();
    sql.append("select reply_id, board_id, user_id, reply_writer, reply_content, create_date, update_date ");
    sql.append("  from reply ");
    sql.append(" where board_id = :boardId ");
    sql.append("offset (:reqPage-1) * :reqRec rows fetch first :reqRec rows only ");

    Map<String, Object> param = Map.of("boardId", boardId,"reqPage",reqPage, "reqRec",reqRec);
    List<Reply> list = template.query(sql.toString(), param, replyRowMapper());

    return list;
  }

  @Override
  public Optional<Reply> findById(Long replyId) {
    StringBuffer sql = new StringBuffer();
    sql.append("select reply_id, board_id, user_id, reply_writer, reply_content, create_date, update_date ");
    sql.append("from reply ");
    sql.append("where reply_id = :replyId ");

    SqlParameterSource sqlParamSrc = new MapSqlParameterSource()
        .addValue("replyId", replyId);

    Reply reply = null;

    try{
      reply = template.queryForObject(
        sql.toString(),
        sqlParamSrc,
        BeanPropertyRowMapper.newInstance(Reply.class));

    } catch(EmptyResultDataAccessException e){
      // 조회된 데이터가 없을시에 예외 처리
      return Optional.empty();
    }

    return Optional.of(reply);
  }

  @Override
  public int totalRec() {
    String sql = "select count(*) from reply ";
    return template.queryForObject(sql, Map.of(), Integer.class);
  }
}
