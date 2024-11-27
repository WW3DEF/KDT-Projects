package com.lhj.bbs.web;

import com.lhj.bbs.domain.entity.Board;
import com.lhj.bbs.domain.entity.Reply;
import com.lhj.bbs.domain.reply.svc.ReplySVC;
import com.lhj.bbs.web.api.ApiResponse;
import com.lhj.bbs.web.api.ApiResponseCode;
import com.lhj.bbs.web.exception.BusinessException;
import com.lhj.bbs.web.req.ReqDels;
import com.lhj.bbs.web.req.ReqSave;
import com.lhj.bbs.web.req.ReqUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/replys")
@RequiredArgsConstructor
public class ApiReplyBbsController {

  private final ReplySVC replySVC;

  //단건조회
  @GetMapping("/{repid}")
//  @ResponseBody
  public ApiResponse<Reply> findById(@PathVariable("repid") Long repid){
    ApiResponse<Reply> res = null;
    Optional<Reply> optionalReply = replySVC.findById(repid);

    log.info("조회 결과={}", optionalReply);

    if(optionalReply.isPresent()){
      Reply reply = optionalReply.get();
      res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS,reply);
    }else{
      throw new BusinessException(ApiResponseCode.ENTITY_NOT_FOUND, null);
    }

    return res;
  }

  @GetMapping
//  @ResponseBody
  public ApiResponse<List<Reply>> reqPage(
      @RequestParam(value="boardId") Long boardId,
      @RequestParam(value="reqPage",defaultValue = "1") Integer reqPage, //요청페이지
      @RequestParam(value="reqRec",defaultValue = "10") Integer reqRec  //요청페이지 레코드수(한페이지에 보여줄 레코드수)
  ) {
    ApiResponse<List<Reply>> res = null;
    List<Reply> replys = replySVC.findAll(reqPage,reqRec, boardId);
    log.info("reply={}", replys);
    int totalRec = replySVC.totalRec();
    if (replys.size() != 0) {
      res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS, replys,totalRec);
    } else {
      throw new BusinessException(ApiResponseCode.ENTITY_NOT_FOUND, null);
    }
    return res;
  }

  //목록
//  @GetMapping
//  @ResponseBody
  public ApiResponse<List<Reply>> all(Board board) {
    ApiResponse<List<Reply>> res = null;
    List<Reply> replys = replySVC.listAll(board.getBoardId());
    if (replys.size() != 0) {
      res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS,replys);
    }else{
      throw new BusinessException(ApiResponseCode.ENTITY_NOT_FOUND, null);
    }
    return res;
  }

  //등록
  @PostMapping
  public ApiResponse<Reply> add(
      @RequestBody ReqSave reqSave
  ){
    log.info("reqSave={}",reqSave);
    ApiResponse<Reply> res = null;

    Reply reply = new Reply();
    BeanUtils.copyProperties(reqSave, reply);
    Long repid = replySVC.add(reply);

    Optional<Reply> optionalReply = replySVC.findById(repid);
    if(optionalReply.isPresent()) {
      Reply savedReply = optionalReply.get();
      res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS, savedReply);
    }else{
      throw new BusinessException(ApiResponseCode.INTERNAL_SERVER_ERROR, null);
    }
    return res;
  }

  //삭제
  @DeleteMapping("/{repid}")
  public ApiResponse<String> delete(@PathVariable("repid") Long repid){
    ApiResponse<String> res = null;

    int rows = replySVC.deleteById(repid);
    if(rows == 1){
      res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS, null);
    }else{
      throw new BusinessException(ApiResponseCode.ENTITY_NOT_FOUND, null);
    }

    return res;
  }

  //수정
  @PatchMapping("/{repid}")
  public ApiResponse<Reply> update(@PathVariable("repid") Long repid, @RequestBody ReqUpdate reqUpdate){
    log.info("pid={}, reqUpdate={}", repid, reqUpdate);
    ApiResponse<Reply> res = null;

    Reply reply = new Reply();
    BeanUtils.copyProperties(reqUpdate, reply);
    int rows = replySVC.updateById(repid, reply);
    if(rows == 1){
      Reply updatedReply = replySVC.findById(repid).get();
      res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS, null);
    }else{
      throw new BusinessException(ApiResponseCode.ENTITY_NOT_FOUND, null);
    }

    return res;
  }

  //여러건 삭제
  @DeleteMapping
  public ApiResponse<String> deleteByIds(@RequestBody ReqDels reqDels){
    log.info("reqDels={}",reqDels);
    ApiResponse<String> res = null;

    int rows = replySVC.deleteByIds(reqDels.getReplyIds());
    if(rows > 0){
      res = ApiResponse.withDetails(ApiResponseCode.RESPONSE_SUCCESS, Map.of("cntOfDel", String.valueOf(rows)), null);
    }else{
      throw new BusinessException(ApiResponseCode.ENTITY_NOT_FOUND, null);
    }
    return res;
  }

  // 전체레코드수 가져오기
  @GetMapping("/totalCnt")
  public ApiResponse<Integer> totalCnt(){
    ApiResponse<Integer> res = null;
    Integer totalRec =  replySVC.totalRec();

    res = ApiResponse.of(ApiResponseCode.RESPONSE_SUCCESS, null,totalRec);

    return res;
  }

}
