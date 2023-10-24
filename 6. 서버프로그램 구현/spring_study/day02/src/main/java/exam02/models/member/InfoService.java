package exam02.models.member;

import java.util.List;

public class InfoService {
    private MemberDao memberDao;


    public void print() {
        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }
}
