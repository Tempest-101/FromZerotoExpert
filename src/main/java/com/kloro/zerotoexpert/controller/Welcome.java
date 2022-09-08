package com.kloro.zerotoexpert.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Welcome {
    @GetMapping({"/FromZerotoExpert"})
    //获取cookie“visited”，如果不存在该cookie则新建一个，设置值为true来判断该页面是否已被访问过
    public String welcome(@CookieValue(value = "visited", defaultValue = "false")String visited, HttpServletResponse response){
        //若不存在“visited”，表现为返回的cookie值为false，则新建
        if(visited.equals("false")){
            Cookie cookie = new Cookie("visited", "true");
            //设置cookie寿命为一天
            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);
            return "嗨，欢迎您来到from zero to expert.";
        }
        return "嗨，欢迎您再次！！！！来到from zero to expert.";
    }
}
