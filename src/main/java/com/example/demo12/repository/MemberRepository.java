package com.example.demo12.repository;

import com.example.demo12.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long>{
    List<Member> findAll(); //Spring Data JPA의 장점을 이용

    Member findByEmail(String email);
}
