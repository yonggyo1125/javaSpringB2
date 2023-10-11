package tests;

import models.member.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {
    private LoginService service;

    @BeforeEach
    void init() {
        service = new LoginService();
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void loginSuccess() {
        assertDoesNotThrow(() -> {
            service.login();
        });
    }
}
