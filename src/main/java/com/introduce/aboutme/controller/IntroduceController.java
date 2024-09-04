package com.introduce.aboutme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroduceController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/members/juni")
    public String introduceT() {
        return "/layout/members/juni";
    }

}
