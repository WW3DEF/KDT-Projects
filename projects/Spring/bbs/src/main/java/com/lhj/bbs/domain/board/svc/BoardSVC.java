package com.lhj.bbs.domain.board.svc;

import com.lhj.bbs.domain.entity.Board;

import java.util.List;
import java.util.Optional;

public interface BoardSVC {
  // 등록
  Long save(Board board);

  // 목록
  List<Board> findAll();

  //조회
  Optional<Board> findById(Long boardId);

  //삭제
  int deleteById(Long boardId);

  //수정
  int updateById(Long boardId, Board board);

  //여러건 삭제
  int deleteByIds(List<Long> boardIds);
}
