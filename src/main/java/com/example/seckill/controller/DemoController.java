package com.example.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wzc
 * @title DemoController
 * @date 2023/2/10 14:22
 * @description TODO
 */
@Controller
@RequestMapping("demo")
public class DemoController {


    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","example");
        return "hello";
    }

}
