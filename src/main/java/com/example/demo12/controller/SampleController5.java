package com.example.demo12.controller;

import com.example.demo12.dto.ItemDTO;
import com.example.demo12.dto.MemberDTO;
import com.example.demo12.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class SampleController5 {


   @Autowired
   private final MemberService memberService; // 의존성 주입

   public SampleController5(MemberService memberService){
       this.memberService=memberService;
   }
    // SampleController5 클래스가 MemberService에 의존하고 있으며, 이를 안전하고 명확하게 주입받기 위해 필요하다.

    @GetMapping(value = "sample5")
    public String sample5(Model model) {
        List<MemberDTO> arrlist = memberService.getMemberLists();
        model.addAttribute("memberList",arrlist);
        log.trace("trace log={}",arrlist);
        return "sample5";
    }

    @GetMapping(value = "memberDeleteOk")
    public String memberDelete(@RequestParam(name="num") String num){
        Long longnum = Long.parseLong(num);
        log.trace("trace log2={}",longnum);
        memberService.deleteMember(longnum);
        return "sample6";
    }
    @GetMapping(value="test2")
    public String test2(){
       return "test2";
    }

    @GetMapping(value="test1")
    public String test1(){
       return "test1";
    }

    @PostMapping(value="param0")
    @ResponseBody
    public List<MemberDTO> param0(){
       List<MemberDTO> m = memberService.getMemberLists();
       return m;
    }

    @PostMapping(value="/param3")
    public String param3(@RequestBody ItemDTO itemDTO){
       return "param3";
    }
}
