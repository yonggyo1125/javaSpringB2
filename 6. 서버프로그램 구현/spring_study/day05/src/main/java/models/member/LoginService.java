package models.member;

import controllers.member.RequestLogin;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class LoginService {

   private final MemberDao memberDao;
   private final HttpSession session;
   private final HttpServletResponse response;


   public void login(RequestLogin form) {
      String userId = form.userId();
      Member member = memberDao.get(userId);

      session.setAttribute("member", member);

      Cookie cookie = new Cookie("saveId", userId);
      boolean saveId = Objects.requireNonNullElse(form.saveId(), false);
      if (saveId) { // 쿠키 저장
         cookie.setMaxAge(60 * 60 * 24 * 365);
      } else { // 쿠키 삭제
         cookie.setMaxAge(0);
      }

      response.addCookie(cookie);
   }
}
