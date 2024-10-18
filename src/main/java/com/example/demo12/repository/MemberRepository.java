package com.example.demo12.repository;

import com.example.demo12.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long>{ //기본키가 Long형 이기 때문에 Long이 들어가는거다.
    List<Member> findAll(); //Spring Data JPA 장점 활용 public 붙히면 안됨

    Member findByEmail(String email);
}
