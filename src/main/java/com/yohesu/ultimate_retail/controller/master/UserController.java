package com.yohesu.ultimate_retail.controller.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yohesu.ultimate_retail.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/master/user/list-user")
    public String viewUserPage(Model model) {
        model.addAttribute("listOfUsers", userService.findAll());
        return "fragments/master/user/list-user";
    }

}
