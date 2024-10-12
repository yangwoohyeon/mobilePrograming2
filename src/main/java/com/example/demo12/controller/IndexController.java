package com.example.demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping(value = "test")//http://localhost:8080/test
    public String test(@RequestParam("name") String name,
            @RequestParam("name2") String name2,Model model){
        model.addAttribute("username",name);
        model.addAttribute("data","데이터");
        model.addAttribute("name2",name2);
        return "test";
    }

}
