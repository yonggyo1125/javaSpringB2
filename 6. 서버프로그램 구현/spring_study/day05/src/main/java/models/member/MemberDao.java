package models.member;

import org.mindrot.jbcrypt.BCrypt;

public class MemberDao {

    public void register(Member member) {

        String userPw = BCrypt.hashpw(member.getUserPw(), BCrypt.gensalt(12));
        member.setUserPw(userPw);

    }

    public Member get(String userId) {

        return null;
    }

    public boolean exists(String userId) {

        return false;
    }

}
