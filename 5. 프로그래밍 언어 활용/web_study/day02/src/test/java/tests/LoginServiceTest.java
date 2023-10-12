package tests;

import jakarta.servlet.http.HttpServletRequest;
import models.member.BadRequestException;
import models.member.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {
    private LoginService service;
    private HttpServletRequest request;



    private void getRequestData(String userId, String userPw) {
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }



    @BeforeEach
    void init() {
        service = new LoginService();
        request = mock(HttpServletRequest.class);
    }


    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void loginSuccess() {
        assertDoesNotThrow(() -> {
            service.login(request);
        });
    }

    @Test
    @DisplayName("필수 항목 검증(userId, userPw), 검증 실패시 BadRequestException 발생")
    void requiredFields() {
        assertThrows(BadRequestException.class, () -> {
            service.login(request);
        });
    }
}
