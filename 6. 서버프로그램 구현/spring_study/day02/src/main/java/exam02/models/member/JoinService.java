package exam02.models.member;

import exam02.commons.Validator;


public class JoinService {
    private Validator<Member> validator;
    private MemberDao memberDao;

    public void join(Member member) {

        validator.check(member);

        memberDao.register(member);
    }
}
