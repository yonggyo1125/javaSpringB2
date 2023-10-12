package models.member;

import commons.Validator;

public class JoinService {

    Validator validator;

    public JoinService(Validator validator) {
        this.validator = validator;
    }

    public void join(Member member) {
        validator.check(member);
    }
}
