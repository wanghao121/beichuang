package com.beichuang.crm.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Date 2020/7/4 14:30
 * @Author wanghao
 * @Version 1.0
 */
@Controller
public class DefaultController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/demo")
    public String demo() {
        return "layout";
    }

}
