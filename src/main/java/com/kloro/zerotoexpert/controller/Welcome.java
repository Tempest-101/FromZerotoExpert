package com.kloro.zerotoexpert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping({"/FromZerotoExpert"})
    public String welcome(){
        return "嗨，欢迎您来到from zero to expert.";
    }
}
