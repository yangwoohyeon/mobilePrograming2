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
@RequiredArgsConstructor //final로 선언된 필드의 생성자를 자동으로 생성0
public class MemberService {
   private final MemberRepository memberRepository;

   @Autowired //스프링 컨테이너에서 빈으로 주입 받는다. Dependency Injection;
   ModelMapper modelMapper;

  public List<MemberDTO> getMemberLists(){
      List<Member> listMember = memberRepository.findAll();
      List<MemberDTO> resultList = listMember.stream().map(member->modelMapper.map(member,MemberDTO.class)).collect(Collectors.toList());
      return resultList;
  }
}
