package controllers.member;

import controllers.RequestLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("/member/login")
    public String login(RequestLogin form) {
        System.out.println(form);

        return "member/login";
    }
}
