package com.example.demo12.repository;

import com.example.demo12.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);// email로 Member 찾기

    List<Member> findAll(); //모두 가지고 와서 LIST에 넣어줌. 선언만 해줌


}
