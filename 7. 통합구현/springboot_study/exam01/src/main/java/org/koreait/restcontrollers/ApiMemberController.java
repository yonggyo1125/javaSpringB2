package org.koreait.restcontrollers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.commons.BadRequestException;
import org.koreait.commons.CommonException;
import org.koreait.commons.JSONData;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<JSONData<Member>> info(@PathVariable String userId) {
        Member member = repository.findByUserId(userId);

        JSONData<Member> data = new JSONData<>(member);

        boolean isError = true;
        if (isError) {
            throw new BadRequestException("에러 발생!!!");
            //throw new RuntimeException("에러 발생!!"); // 500
        }

        return ResponseEntity.status(data.getStatus()).body(data);
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
    public ResponseEntity<Object> login(@RequestBody @Valid RequestLogin form, Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getAllErrors().stream()
                    .map(o -> o.getDefaultMessage())
                    .collect(Collectors.joining(","));

            throw new RuntimeException(message);
        }

        log.info(form.toString());
        /*
        return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .header("TestHeader", "Test")
                    .build();

         */
        return ResponseEntity.ok().build();
    }


}
