package com.lhj.bbs.DAO;

import com.lhj.bbs.domain.entity.Reply;
import com.lhj.bbs.domain.reply.dao.ReplyDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@Slf4j
@SpringBootTest
public class ReplyImpTest {

  @Autowired
  ReplyDAO replyDAO;

  @Test
  @DisplayName("등록")
  void add(){
    Long rid = 402L;

    Reply reply = new Reply();
    reply.setBoardId(rid);
    reply.setReplyWriter("널널한 엔지니어");
    reply.setReplyContent("개발의 핵심은 구글링에 있다");

    Long repId = replyDAO.add(reply);
    log.info("repId={}", repId);
  }

  @Test
  @DisplayName("수정")
  void update(){
    Long repId = 22L;

    Reply reply = new Reply();
    reply.setReplyWriter("이지스");
    reply.setReplyContent("글에 오타가 있어 내용을 수정합니다");

    replyDAO.updateById(repId, reply);
    Optional<Reply> optionalRep = replyDAO.findById(repId);

    log.info("optionalRep={}", optionalRep);
  }

  @Test
  @DisplayName("삭제")
  void delete(){
    Long repId = 23L;

    int deleteRep = replyDAO.deleteById(repId);

    log.info("deleteRep={}", deleteRep);
  }

  @Test
  @DisplayName("목록")
  void listAll(){
    List<Reply> replyList = replyDAO.listAll();
    for (Reply reply : replyList) {
        log.info("reply={}", reply);
    }
  }

  @Test
  @DisplayName("조회")
  void searchById(){
    Long repId = 21L;
    Optional<Reply> optionRepId = replyDAO.findById(repId);

    log.info("optionalRepId={}", optionRepId);
  }
}
