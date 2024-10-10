package com.example.demo12.repository;

import com.example.demo12.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long>{
    List<Member> findAll(); //Spring Data JPA 장점 활용

    Member findByEmail(String email);
}
