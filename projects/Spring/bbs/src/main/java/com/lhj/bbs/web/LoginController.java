package com.lhj.bbs.web;

import com.lhj.bbs.domain.entity.User;
import com.lhj.bbs.domain.user.svc.UserSVC;
import com.lhj.bbs.web.form.login.LoginForm;
import com.lhj.bbs.web.form.login.LoginUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Slf4j
@Controller
@RequiredArgsConstructor
public class LoginController {

  private final UserSVC userSVC;

  @GetMapping("/login")
  public String loginForm(Model model) {
    model.addAttribute("loginForm", new LoginForm());

    return "/login/loginForm";
  }

  @PostMapping("/login")
  public String login(LoginForm loginForm,
                      BindingResult bindingResult,
                      HttpServletRequest request) {

    if(!userSVC.isCorrect(loginForm.getEmail())){
      bindingResult.rejectValue("email",
          "invalidMember",
          "오류 메세지");

      return "/login/loginForm";
    }

    //  2) 비밀번호 일치여부 체크
    Optional<User> optionalMember = userSVC.findByEmail(loginForm.getEmail());
    User loginUser = optionalMember.get();
    log.info("loginUser={}", loginUser);

    if(!loginForm.getPasswd().equals(loginUser.getPasswd())){
      bindingResult.rejectValue("passwd", "invalidMember");
      return "login/loginForm";
    }

//    3) 로그인 세션 반영
    HttpSession session = request.getSession(true);

//    4) 세션에 회원정보 저장
    LoginUser loginSuccUser = new LoginUser(
        loginUser.getUserId(),
        loginUser.getEmail(),
        loginUser.getPasswd(),
        loginUser.getNickname()
    );
    session.setAttribute("loginSuccUser", loginSuccUser);

    return "redirect:/freeBoard";
  }

  @GetMapping("/logout")
  public String logout(HttpServletRequest request) {
    HttpSession session = request.getSession(false);
    session.invalidate();

    return "redirect:/freeBoard";
  }
}
