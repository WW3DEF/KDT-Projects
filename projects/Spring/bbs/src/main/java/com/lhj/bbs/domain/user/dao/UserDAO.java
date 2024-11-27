package com.lhj.bbs.domain.user.dao;

import com.lhj.bbs.domain.entity.User;

import java.util.Optional;

public interface UserDAO {

//  회원가입
  Long signUp(User user);

//  회원 정보일치
  boolean isCorrect(String email);

//  회원 조회
  Optional<User> findByUserId(Long userId);

  Optional<User> findByEmail(String email);

}
