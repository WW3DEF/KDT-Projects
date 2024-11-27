package com.lhj.bbs.domain.reply.svc;

import com.lhj.bbs.domain.entity.Reply;

import java.util.List;
import java.util.Optional;

public interface ReplySVC {

  //  추가
  Long add(Reply reply);

  //  수정
  int updateById(Long replyId, Reply reply);

  //  삭제
  int deleteById(Long replyId);

  //  여러건삭제
  int deleteByIds(List<Long> replyIds);

  //  조회
  Optional<Reply> findById(Long replyId);

  //  목록
  List<Reply> listAll(Long boardId);

  List<Reply> findAll(int reqPage,int reqRec, Long boardId);

  //총 레코드 건수
  int totalRec();
}
