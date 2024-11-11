package com.lhj.bbs.DAO;

import com.lhj.bbs.domain.entity.Board;
import com.lhj.bbs.domain.board.dao.BoardDAO;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@SpringBootTest
public class BoardImpTest {

  @Autowired
  BoardDAO boardDAO;

  @Test
  @DisplayName("전체 조회")
  void findAll() {
    try {
      List<Board> list = boardDAO.findAll();
      for (Board board : list) {
        log.info("board={}", board);
      }
    } catch (Exception e) {
      log.error("테스트 실패 : ",e);
    }
  }

  @Test
  @DisplayName("상품단건 조회")
  void findById() {
    Long boardId = 401L;

    Optional<Board> board = boardDAO.findById(boardId);

    Board findBoard = board.orElseThrow();
    log.info("findBoard={}", findBoard);

    Assertions.assertThat(findBoard.getBoardTitle()).isEqualTo("dadas");
    Assertions.assertThat(findBoard.getBoardContent()).isEqualTo("dasdasd");
    Assertions.assertThat(findBoard.getBoardWriter()).isEqualTo("asdadada");
    Assertions.assertThat(findBoard.getBoardDate()).isEqualTo(Timestamp.valueOf("2024-11-08 19:48:59.000000000"));
//    Assertions.assertThat(findBoard.getBoardUpdate()).isEqualTo(Timestamp.valueOf("2024-11-07 17:29:28.0"));

  }

  @Test
  @DisplayName("저장")
  void save(){
    Board board = new Board();
    board.setBoardTitle("하하하호호");
    board.setBoardContent("ㅁㄴㅇㅁㅈㄷㅂㅈ");
    board.setBoardWriter("ㄴㅁ아낭마");

    Long bid = boardDAO.save(board);
    log.info("상품아이디={}", bid);
  }

  @Test
  @DisplayName("수정")
  void updateById(){
    Long boardId = 401L;
    Board board = new Board();
    board.setBoardTitle("ㅇㅇㅇ");
    board.setBoardContent("ㅎㅎㅎㅎ");
    board.setBoardWriter("ㅂㅂㅂㅂ");

    boardDAO.updateById(boardId, board);
    Optional<Board> optionalBoard = boardDAO.findById(boardId);

    log.info("updateBoard={}", optionalBoard);

    Board findBoard = optionalBoard.orElseThrow();

    Assertions.assertThat(findBoard.getBoardTitle()).isEqualTo("ㅇㅇㅇ");
    Assertions.assertThat(findBoard.getBoardContent()).isEqualTo("ㅎㅎㅎㅎ");
    Assertions.assertThat(findBoard.getBoardWriter()).isEqualTo("ㅂㅂㅂㅂ");

  }

  @Test
  @DisplayName("단건삭제")
  void deleteById(){
    Long boardId = 361L;
    int row = boardDAO.deleteById(boardId);

    log.info("deleteBoard={}", row);
  }

}
