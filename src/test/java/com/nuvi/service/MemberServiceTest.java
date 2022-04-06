package com.nuvi.service;

import com.nuvi.domain.Member;
import com.nuvi.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원조회() throws Exception {
        List<Member> results = memberService.findMembers();

        for(Member member : results) {
            System.out.println(member);
        }
    }
}
