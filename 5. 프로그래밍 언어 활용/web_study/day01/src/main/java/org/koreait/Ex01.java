package org.koreait;

public class Ex01 {
    public static void main(String[] args) {
        /*
        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setUserNm("사용자01");
         */
        Member member2 = new Member();
        Member member = new Member("user01", "123456", "사용자01");
        System.out.println(member);
    }
}
