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
@RequiredArgsConstructor //final로 선언된 필드의 생성자를 자동으로 생성
public class MemberService {
   private final MemberRepository memberRepository;
   @Autowired
   ModelMapper modelMapper;

   public List<MemberDTO> getMemberLists(){
       List<Member> listMember;
       listMember = memberRepository.findAll();
       List<MemberDTO> resultList = listMember.stream().map(member->modelMapper.map(member,MemberDTO.class)).collect(Collectors.toList());
       return resultList;
   }
}
