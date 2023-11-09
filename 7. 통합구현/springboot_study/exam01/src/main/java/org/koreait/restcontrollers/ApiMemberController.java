package org.koreait.restcontrollers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class ApiMemberController {

    private final MemberRepository repository;

    @GetMapping("/{userId}")
    public Member info(@PathVariable String userId) {
        Member member = repository.findByUserId(userId);

        return member;
    }

    @GetMapping("/list")
    public List<Member> list() {
        List<Member> members = (List<Member>)repository.findAll();

        return members;
    }

    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요.";
    }

    @GetMapping("/test")
    public void test() {
        log.info("테스트.....");
    }

    @PostMapping("/login")
    public void login(@RequestBody @Valid RequestLogin form, Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getAllErrors().stream()
                    .map(o -> o.getDefaultMessage())
                    .collect(Collectors.joining(","));

            throw new RuntimeException(message);
        }

        log.info(form.toString());
    }

    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e) {
        return e.getMessage();
    }
}
