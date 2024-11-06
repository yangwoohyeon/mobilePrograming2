package com.example.demo12.controller;

import com.example.demo12.dto.MemberDTO;
import com.example.demo12.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController5 {


    @Autowired
    private final MemberService memberService;

    public SampleController5(MemberService memberService){
        this.memberService=memberService;
    }
    // SampleController5 클래스가 MemberService에 의존하고 있으며, 이를 안전하고 명확하게 주입받기 위해 필요하다.

    @GetMapping(value = "sample5")
    public String sample5(Model model) {
        List<MemberDTO> arrlist = memberService.getMemberLists();
        model.addAttribute("memberList",arrlist);
        return "sample5";
    }

}
