package com.example.demo12.controller;

import com.example.demo12.dto.ItemDTO;
import com.example.demo12.dto.MemberDTO;
import com.example.demo12.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j //로그 생성
@Controller
public class IndexController {

    @Autowired
    private final MemberService memberService;

    public IndexController(MemberService memberService){
        this.memberService=memberService;
    }

    @PostMapping(value = "/param3")
    public String jsonexample(@RequestBody ItemDTO item, Model model) {
        model.addAttribute("itemname", item.getItemname());
        model.addAttribute("itemprice", item.getItemprice());

        List<MemberDTO> arrlist = memberService.getMemberLists();

        return "/thymeleaf/param6re";
    }

}
