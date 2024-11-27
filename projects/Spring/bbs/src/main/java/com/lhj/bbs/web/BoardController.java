package com.lhj.bbs.web;

import com.lhj.bbs.domain.entity.Board;
import com.lhj.bbs.domain.board.svc.BoardSVC;
import com.lhj.bbs.domain.entity.Reply;
import com.lhj.bbs.domain.reply.svc.ReplySVC;
import com.lhj.bbs.web.form.board.AllForm;
import com.lhj.bbs.web.form.board.DetailForm;
import com.lhj.bbs.web.form.board.SaveForm;
import com.lhj.bbs.web.form.board.UpdateForm;
import com.lhj.bbs.web.form.login.LoginUser;
import com.lhj.bbs.web.form.reply.ReplyForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/freeBoard")
@RequiredArgsConstructor
public class BoardController {

  private final BoardSVC boardSVC;
  private final ReplySVC replySVC;


  @GetMapping("/add")
  public String addForm(Model model){
    model.addAttribute("saveForm", new SaveForm());

    return "board/add";
  }

  @PostMapping("/add")
  public String add(
        @Valid
        @ModelAttribute SaveForm saveForm,
        BindingResult bindingResult,
        @SessionAttribute("loginSuccUser")
        LoginUser loginUser,
        RedirectAttributes redirectAttributes)
  {
      if(!loginUser.getNickname().isEmpty()) {

        Board board = new Board();
        board.setUserId(loginUser.getUserId());
        board.setBoardTitle(saveForm.getBoardTitle());
        board.setBoardContent(saveForm.getBoardContent());
        board.setBoardWriter(loginUser.getNickname());

        Long saveId = boardSVC.save(board);

        redirectAttributes.addAttribute("id", saveId);
      }
    return "redirect:/freeBoard/{id}";
  }

  @GetMapping
  public String findAll(Model model){
    List<Board> list = boardSVC.findAll();
    List<AllForm> all = new ArrayList<>();

    for (Board board : list) {

      AllForm allForm = new AllForm();
      allForm.setBoardId(board.getBoardId());
      allForm.setUserId(board.getUserId());
      allForm.setBoardTitle(board.getBoardTitle());
      allForm.setBoardWriter(board.getBoardWriter());
      allForm.setBoardDate(board.getBoardDate());

      all.add(allForm);
    }

    model.addAttribute("list", all);

    return "/board/all";
  }

  @GetMapping("/{id}")
  public String findById(
      @PathVariable("id") Long boardId,
      Model model)
  {
    Optional<Board> findId = boardSVC.findById(boardId);
    Board board = findId.orElseThrow();

    DetailForm detailForm = new DetailForm();

    detailForm.setBoardId(board.getBoardId());
    detailForm.setUserId(board.getUserId());
    detailForm.setBoardTitle(board.getBoardTitle());
    detailForm.setBoardContent(board.getBoardContent());
    detailForm.setBoardWriter(board.getBoardWriter());
    detailForm.setBoardDate(board.getBoardDate());
    detailForm.setBoardUpdate(board.getBoardUpdate());

    List<Reply> replyList = replySVC.listAll(boardId);
    List<ReplyForm> listAll = new ArrayList<>();
    for (Reply reply  : replyList) {
      ReplyForm replyForm = new ReplyForm();

      replyForm.setReplyId(reply.getReplyId());
      replyForm.setBoardId(reply.getBoardId());
      replyForm.setUserId(reply.getUserId());
      replyForm.setReplyWriter(reply.getReplyWriter());
      replyForm.setReplyContent(reply.getReplyContent());
      replyForm.setCreateDate(reply.getCreateDate());
      replyForm.setUpdateDate(reply.getUpdateDate());

      listAll.add(replyForm);

    }

    model.addAttribute("replyForm", listAll);
    model.addAttribute("detailForm", detailForm);

    return "/board/detailForm";
  }

  @PostMapping("/{id}/reply")
  public String addReply(
      @PathVariable("id") Long boardID,
      @ModelAttribute ReplyForm replyForm,
      @SessionAttribute("loginSuccUser")
      LoginUser loginUser
  ) {
      Reply reply = new Reply();

      reply.setUserId(loginUser.getUserId());
      reply.setBoardId(boardID);
      reply.setReplyWriter(loginUser.getNickname());
      reply.setReplyContent(replyForm.getReplyContent());

      replySVC.add(reply);
      log.info("reply={}", reply);

      return "redirect:/freeBoard/{id}";
  }

  @PostMapping("/del")
  public String deleteByIds(
      @RequestParam("boardIds") List<Long> boardIds
   ){

    int rows = boardSVC.deleteByIds(boardIds);

    return "redirect:/freeBoard";
  }

  @GetMapping("/{id}/del")
  public String deleteById(@PathVariable("id") Long boardId){
    List<Reply> all = replySVC.listAll(boardId);
    List<Long> clearRepList = new ArrayList<>();
    for (Reply reply : all) {
      Long longRepId = reply.getReplyId();

      clearRepList.add(longRepId);
    }
    log.info("clearRepList={}", clearRepList);
    replySVC.deleteByIds(clearRepList);

    int row = boardSVC.deleteById(boardId);

    return "redirect:/freeBoard";
  }

  @GetMapping("/{id}/edit")
  public String updateForm(@PathVariable("id") Long boardId, Model model) {

    Optional<Board> optionBoard = boardSVC.findById(boardId);
    Board findBoard = optionBoard.orElseThrow();

    UpdateForm updateForm = new UpdateForm();
    updateForm.setBoardId(findBoard.getBoardId());
    updateForm.setBoardTitle(findBoard.getBoardTitle());
    updateForm.setBoardContent(findBoard.getBoardContent());
    updateForm.setBoardWriter(findBoard.getBoardWriter());
    updateForm.setBoardDate(findBoard.getBoardDate());
    updateForm.setBoardUpdate(findBoard.getBoardUpdate());

    model.addAttribute("updateForm", updateForm);

    return "/board/updateForm";
  }

  @PostMapping("/{id}/edit")
  public String updateById(
      @PathVariable("id") Long boardId,
      UpdateForm updateForm,
      RedirectAttributes redirectAttributes
  ) {

    Board board = new Board();

    board.setBoardTitle(updateForm.getBoardTitle());
    board.setBoardContent(updateForm.getBoardContent());
    board.setBoardWriter(updateForm.getBoardWriter());
    board.setBoardUpdate(updateForm.getBoardUpdate());

    int rows = boardSVC.updateById(boardId, board);

    redirectAttributes.addAttribute("id", boardId);

    return "redirect:/freeBoard/{id}";
  }
}