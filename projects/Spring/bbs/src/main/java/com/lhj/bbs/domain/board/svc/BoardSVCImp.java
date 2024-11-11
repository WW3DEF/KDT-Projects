package com.lhj.bbs.domain.board.svc;

import com.lhj.bbs.domain.entity.Board;
import com.lhj.bbs.domain.board.dao.BoardDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j

// 서비스 계층을 정의할때 사용
@Service

@RequiredArgsConstructor
public class BoardSVCImp implements BoardSVC{

  private final BoardDAO boardDAO;

  @Override
  public Long save(Board board) {
    return boardDAO.save(board);
  }

  @Override
  public List<Board> findAll() {
    return boardDAO.findAll();
  }

  @Override
  public Optional<Board> findById(Long boardId) {
    return boardDAO.findById(boardId);
  }

  @Override
  public int deleteById(Long boardId) {
    return boardDAO.deleteById(boardId);
  }

  @Override
  public int updateById(Long boardId, Board board) {
    return boardDAO.updateById(boardId, board);
  }

  @Override
  public int deleteByIds(List<Long> boardIds) {
    return boardDAO.deleteByIds(boardIds);
  }
}
