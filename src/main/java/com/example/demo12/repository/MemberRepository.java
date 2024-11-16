package com.example.demo12.repository;

import com.example.demo12.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long>{
    List<Member> findAll();
    Member findByEmail(String email);
    void deleteById(long id);
    void deleteByNum(long num);
}
