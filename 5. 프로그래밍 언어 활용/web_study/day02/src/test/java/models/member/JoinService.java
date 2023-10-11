package models.member;

public class JoinService {

    JoinValidator validator = new JoinValidator();

    public void join(Member member) {
        validator.check(member);
    }
}
