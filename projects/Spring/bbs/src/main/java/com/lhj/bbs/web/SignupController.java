package com.lhj.bbs.web;

import com.lhj.bbs.domain.entity.User;
import com.lhj.bbs.domain.user.svc.UserSVC;
import com.lhj.bbs.web.form.signup.SignupForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class SignupController {

  private final UserSVC userSVC;

  @GetMapping("/signup")
  public String signup(Model model) {
    model.addAttribute("signupForm", new SignupForm());

    return "/signup/signupForm";
  }

  @PostMapping("/signup")
  public String insertInfo(@ModelAttribute("signupForm") SignupForm signupForm) {
    User user = new User();
    user.setEmail(signupForm.getEmail());
    user.setPasswd(signupForm.getPasswd());
    user.setNickname(signupForm.getNickname());

    userSVC.signUp(user);

    return "redirect:/login";
  }
}