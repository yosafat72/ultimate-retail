package com.yohesu.ultimate_retail.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/master/user/list-user")
    public String viewUserPage() {
        return "fragments/master/user/list-user";
    }

}
