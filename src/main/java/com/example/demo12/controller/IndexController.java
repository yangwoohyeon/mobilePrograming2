package com.example.demo12.controller;

import com.example.demo12.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping(value = "test")//bhttp://localhost:8080/test?name2=Doe
    public String test(@RequestParam(value="name",required=false) String name,
            @RequestParam(value="name2") String name2,Model model){
        model.addAttribute("username",name);
        model.addAttribute("data","데이터");
        model.addAttribute("name2",name2);
        return "test";
    }
    @GetMapping(value="/param6")
    public String param6(ItemDto itemdto,Model model){
        model.addAttribute("itemname",itemdto.getItemname());
        model.addAttribute("itemprice",itemdto.getItemprice());
        return "param6";
    }

}
