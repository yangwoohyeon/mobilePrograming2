package com.example.demo12.controller;

import com.example.demo12.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class IndexController {

    @GetMapping(value = "test")//bhttp://localhost:8080/test?name2=Doe
    public String test(@RequestParam(value="name",required=false) String name,
                       @RequestParam(value="name2",required=false) String name2,Model model){
        model.addAttribute("name",name);
        model.addAttribute("name2",name2);
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);

        return "test";
    }

    @GetMapping(value="/param6")
    public String param6(ItemDTO itemDTO,Model model){
        model.addAttribute("itemname",itemDTO.getItemname());
        model.addAttribute("itemprice",itemDTO.getItemprice());
        return "/param6";
    }

}
