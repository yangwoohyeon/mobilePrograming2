package com.example.demo12.service;

import com.example.demo12.dto.MemberDTO;
import com.example.demo12.model.Member;
import com.example.demo12.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    //@Autowired 사용 지양됨 -> @RequiredArgsConstructor 로 생성되는 생성자로 주입받기 위해 final 붙임.
    private final MemberRepository memberRepository; // final로 선언 되어야함!!
    @Autowired // Spring 컨테이너에서 빈으로 주입 받는다.
    ModelMapper modelMapper; //엔티티 객체와 DTO 객체 간의 매핑을 도와주는 도구

    public List<MemberDTO> getMemberLists(){
        List<Member> listMembers;
        listMembers = memberRepository.findAll(); // ==> DB에서 모든 맴버 정보를 가지고 옴.

        //1번
        List<MemberDTO> resultList = listMembers.stream()
                .map(member -> modelMapper.map(member, MemberDTO.class))
                .collect(Collectors.toList()); //리스트로 변환해주는 역할을 한다.
// .MemeberDTO 리스트 반환


        return resultList;
    }



}
