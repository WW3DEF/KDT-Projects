package com.lhj.bbs.domain.user.svc;

import com.lhj.bbs.domain.entity.User;
import com.lhj.bbs.domain.user.dao.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

@RequiredArgsConstructor
public class UserSVCImpl implements UserSVC{

  private final UserDAO userDAO;

  @Override
  public Long signUp(User user) {
    return userDAO.signUp(user);
  }

  @Override
  public boolean isCorrect(String email) {
    return userDAO.isCorrect(email);
  }

  @Override
  public Optional<User> findByUserId(Long userId) {
    return userDAO.findByUserId(userId);
  }

  @Override
  public Optional<User> findByEmail(String email) {
    return userDAO.findByEmail(email);
  }
}
