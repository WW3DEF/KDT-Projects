package com.lhj.bbs.domain.user.dao;

import com.lhj.bbs.domain.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserDAOImplTest {

  @Autowired
  private UserDAO userDAO;

  @Test
  @DisplayName("회원가입 테스트")
  void signUp(){
    User user = new User();
    user.setEmail("ㅇㅇ");
    user.setPasswd("12312312");
    user.setNickname("가나다");

    Long signedUser = userDAO.signUp(user);
    log.info("User={}", signedUser);
  }
}