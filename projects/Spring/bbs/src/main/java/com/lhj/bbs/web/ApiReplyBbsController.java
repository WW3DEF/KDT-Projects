package com.lhj.bbs.web;

import com.lhj.bbs.domain.entity.Reply;
import com.lhj.bbs.domain.reply.svc.ReplySVC;
import com.lhj.bbs.web.api.ApiResponse;
import com.lhj.bbs.web.req.ReqDels;
import com.lhj.bbs.web.req.ReqSave;
import com.lhj.bbs.web.req.ReqUpdate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
      res = ApiResponse.createApiResponse("00","success",reply);
    }else{
      res = ApiResponse.createApiResponse("01","not found",null);
    }

    return res;
  }

  //목록
  @GetMapping
//  @ResponseBody
  public ApiResponse<List<Reply>> all() {
    ApiResponse<List<Reply>> res = null;
    List<Reply> replys = replySVC.listAll();
    if (replys.size() != 0) {
      res = ApiResponse.createApiResponse("00", "success", replys);
    }else{
      res = ApiResponse.createApiResponse("01", "not found", null);
    }
    return res;
  }

  //상품등록
  @PostMapping
  public ApiResponse<Reply> add(@RequestBody ReqSave reqSave){
    log.info("reqSave={}",reqSave);
    ApiResponse<Reply> res = null;

    Reply reply = new Reply();
    BeanUtils.copyProperties(reqSave, reply);
    Long repid = replySVC.add(reply);

    Optional<Reply> optionalReply = replySVC.findById(repid);
    if(optionalReply.isPresent()) {
      Reply savedReply = optionalReply.get();
      res = ApiResponse.createApiResponse("00", "success", savedReply);
    }else{
      res = ApiResponse.createApiResponse("99", "fail", null);
    }
    return res;
  }

  //상품삭제
  @DeleteMapping("/{repid}")
  public ApiResponse<String> delete(@PathVariable("repid") Long repid){
    ApiResponse<String> res = null;

    int rows = replySVC.deleteById(repid);
    if(rows == 1){
      res = ApiResponse.createApiResponse("00", "success", null);
    }else{
      res = ApiResponse.createApiResponse("01", "not found", null);
    }

    return res;
  }


  //상품수정
  @PatchMapping("/{repid}")
  public ApiResponse<Reply> update(@PathVariable("repid") Long repid, @RequestBody ReqUpdate reqUpdate){
    log.info("pid={}, reqUpdate={}", repid, reqUpdate);
    ApiResponse<Reply> res = null;

    Reply reply = new Reply();
    BeanUtils.copyProperties(reqUpdate, reply);
    int rows = replySVC.updateById(repid, reply);
    if(rows == 1){
      Reply updatedReply = replySVC.findById(repid).get();
      res = ApiResponse.createApiResponse("00", "success", updatedReply);
    }else{
      res = ApiResponse.createApiResponse("01", "not found", null);
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
      res = ApiResponse.createApiResponse("00", "success", "삭제건수 : " + rows);
    }else{
      res = ApiResponse.createApiResponse("01", "not found", null);
    }
    return res;
  }

}
