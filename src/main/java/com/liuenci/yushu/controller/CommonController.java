package com.liuenci.yushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    /**
     * 主界面
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
