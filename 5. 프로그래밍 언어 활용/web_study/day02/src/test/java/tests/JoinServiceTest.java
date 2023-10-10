package tests;

import models.member.JoinService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    @Test
    @DisplayName("회원가입 성공시 예외가 발생하지 않음")
    void joinSucess() {
        assertDoesNotThrow(() -> {
            JoinService service = new JoinService();
            service.join();
        });
    }
    
    @Test
    @DisplayName("필수 항목(userId, userPw, confirmUserPw, userNm) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFields() {
        
    }
}
