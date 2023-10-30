package models.member;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder @Data
public class Member {
    private long userNo;
    private String userId;
    private String userPw;
    private String confirmUserPw;
    private String userNm;
    private String email;
    private String mobile;
    private boolean agree; // 약관 동의
    private LocalDateTime regDt; // 가입일시
    private LocalDateTime modDt;
}
