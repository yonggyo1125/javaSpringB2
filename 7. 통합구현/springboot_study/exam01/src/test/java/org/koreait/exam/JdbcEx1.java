package org.koreait.exam;

import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class JdbcEx1 {
    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>)repository.findAll();
        members.stream().forEach(System.out::println);
    }

    @Test
    void test2() {
        Member member = repository.findById(7L).orElse(null);
        System.out.println(member);

        member.setUserNm("(수정)사용자05");
        member.setModDt(LocalDateTime.now());
        repository.save(member);
    }

    @Test
    void test3() {
        //System.out.println(repository.getSequence());
        Member member = Member.builder()
                //.userNo(repository.getSequence())
                .userId("user08")
                .userPw("123456")
                .userNm("사용자08")
                .email("user08@test.org")
                .mobile("01000000000")
                .regDt(LocalDateTime.now())
                .build();
        repository.save(member);
    }

    @Test
    void test4() {
        repository.deleteById(7L);
    }
}
