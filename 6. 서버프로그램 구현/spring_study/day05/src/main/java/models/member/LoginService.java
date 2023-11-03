package models.member;

import controllers.member.RequestLogin;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

   private final MemberDao memberDao;
   private final HttpSession session;

   public void login(RequestLogin form) {
      String userId = form.userId();
      Member member = memberDao.get(userId);

      session.setAttribute("member", member);

   }
}
