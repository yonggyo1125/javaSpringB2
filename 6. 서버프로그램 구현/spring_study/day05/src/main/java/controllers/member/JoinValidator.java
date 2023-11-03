package controllers.member;

import commons.MobileValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator, MobileValidator {
    @Override
    public boolean supports(Class<?> clazz) {

        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestJoin form = (RequestJoin)target;

        /**
         * 추가 검증 부분
         * 1. 아이디 중복 여부 - 중복 가입 X
         * 2. 비밀번호, 비밀번호 확인 일치여부
         * 3. 휴대전화번호(필수 X) -> 입력되면 형식 체크
         */

        String userId = form.getUserId();
        String userPw = form.getUserPw();
        String confirmUserPw = form.getConfirmUserPw();
        String mobile = form.getMobile();


        // 2. 비밀번호, 비밀번호 확인 일치여부
        if (userPw != null && !userPw.isBlank()
                && confirmUserPw != null && !confirmUserPw.isBlank()
                && !userPw.equals(confirmUserPw)) {
            errors.rejectValue("confirmUserPw", "Mismatch");
        }

        // 3. 휴대전화번호(필수 X) -> 입력되면 형식 체크
        if (mobile != null && !mobile.isBlank() && !checkMobile(mobile)) {
            errors.rejectValue("mobile", "Mobile");
        }
    }
}
