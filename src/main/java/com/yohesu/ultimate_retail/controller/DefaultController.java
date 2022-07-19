package com.yohesu.ultimate_retail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String viewIndexPage(){
        return "index";
    }

    @GetMapping("/index")
    public String viewIndex2Page(){
        return "index";
    }

    @GetMapping("/dashboard")
    public String viewDashboardPgae(){
        return "fragments/dashboard";
    }

}
