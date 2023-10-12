package tests;

import models.member.BadRequestException;
import models.member.JoinService;
import models.member.JoinValidator;
import models.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    private JoinService service;


    private Member getMember() {
        Member member = new Member();
        member.setUserId("user" + System.currentTimeMillis());
        member.setUserNm("사용자");
        member.setUserPw("12345678");
        member.setConfirmUserPw(member.getUserPw());

        return member;
    }

    @BeforeEach
    void init() {

        service = new JoinService(new JoinValidator());
    }


    @Test
    @DisplayName("회원가입 성공시 예외가 발생하지 않음")
    void joinSuccess() {
        assertDoesNotThrow(() -> {
            service.join(getMember());
        });
    }
    
    @Test
    @DisplayName("필수 항목(userId, userPw, confirmUserPw, userNm) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFields() {
        assertAll(
                () -> {
                    // userId가 null, 또는 " "(빈 값)일때
                    Member member = getMember();
                    member.setUserId(null);
                    requiredFieldEach(member, "아이디");
                    member.setUserId("   ");
                    requiredFieldEach(member, "아이디");
                },
                () -> {
                    // userPw가 null, 또는 " "(빈 값)일때
                    Member member = getMember();
                    member.setUserPw(null);
                    requiredFieldEach(member, "비밀번호");
                    member.setUserPw("  ");
                    requiredFieldEach(member, "비밀번호");
                },
                () -> {
                    // confirmUserPw null, 또는 " "(빈 값)일때
                    Member member = getMember();
                    member.setConfirmUserPw(null);
                    requiredFieldEach(member, "비밀번호를 확인");
                    member.setConfirmUserPw("   ");
                    requiredFieldEach(member, "비밀번호를 확인");
                },
                () -> {
                    // userNm가 null, 또는 " "(빈 값)일때
                    Member member = getMember();
                    member.setUserNm(null);
                    requiredFieldEach(member, "회원명");
                    member.setUserNm("   ");
                    requiredFieldEach(member, "회원명");
                }
        );

    }

    private void requiredFieldEach(Member member, String word) {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
           service.join(member);
        });

        assertTrue(thrown.getMessage().contains(word));
    }
}
