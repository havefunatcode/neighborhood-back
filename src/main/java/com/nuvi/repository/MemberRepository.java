package com.nuvi.repository;

import com.nuvi.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(String id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
