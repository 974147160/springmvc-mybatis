package com.ysh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ysh")
public class YshController {

    @GetMapping(value = "/firstQuery")
    public String firstQuery(){
        return "firstQuery1";
    }
}
