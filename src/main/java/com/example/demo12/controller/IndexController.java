package com.example.demo12.controller;

import com.example.demo12.dto.ItemDTO;
import com.example.demo12.dto.MemberDTO;
import com.example.demo12.model.Member;
import com.example.demo12.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        return "/param6";
    }


 @PostMapping(value="param4")
 @ResponseBody //반환값이 Json, Xml형식으로 HTTP응답 본문에 포함됨
    public List<MemberDTO> json(){
        List<MemberDTO> mlist = memberService.getMemberLists();
        return mlist;
 }

 @PostMapping(value="/param8")
 @ResponseBody
    public ItemDTO json(@RequestBody ItemDTO itemDTO){
        return itemDTO;
 }

}
