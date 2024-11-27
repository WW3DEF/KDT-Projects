package com.lhj.bbs.domain.reply.svc;

import com.lhj.bbs.domain.entity.Reply;
import com.lhj.bbs.domain.reply.dao.ReplyDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReplySVCImpl implements ReplySVC{

    private final ReplyDAO replyDAO;

  @Override
  public Long add(Reply reply) {
    return replyDAO.add(reply);
  }

  @Override
  public int updateById(Long replyId, Reply reply) {
    return replyDAO.updateById(replyId, reply);
  }

  @Override
  public int deleteById(Long replyId) {
    return replyDAO.deleteById(replyId);
  }

  @Override
  public int deleteByIds(List<Long> replyIds) {
    return replyDAO.deleteByIds(replyIds);
  }

  @Override
  public Optional<Reply> findById(Long replyId) {
    return replyDAO.findById(replyId);
  }

  @Override
  public List<Reply> listAll(Long boardId) {
    return replyDAO.listAll(boardId);
  }

  @Override
  public List<Reply> findAll(int reqPage, int reqRec, Long boardId) {
    return replyDAO.findAll(reqPage,reqRec, boardId);
  }

  @Override
  public int totalRec() {
    return replyDAO.totalRec();
  }
}
