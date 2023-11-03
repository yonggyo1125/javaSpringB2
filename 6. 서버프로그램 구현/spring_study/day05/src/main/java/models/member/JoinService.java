package models.member;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final JoinValidator validator;
    private final MemberDao memberDao;


    public void join(Member member) {

        validator.check(member);

        memberDao.register(member);
    }

    public void join(HttpServletRequest request) {
        String _agree = Objects.requireNonNullElse(request.getParameter("agree"), "false");
        boolean agree = _agree.equals("true") ? true : false;

        Member member = Member.builder()
                .userId(request.getParameter("userId"))
                .userPw(request.getParameter("userPw"))
                .confirmUserPw(request.getParameter("confirmUserPw"))
                .email(request.getParameter("email"))
                .userNm(request.getParameter("userNm"))
                .agree(agree)
                .build();
        join(member);
    }
}
