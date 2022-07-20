package com.yohesu.ultimate_retail.controller.master;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yohesu.ultimate_retail.model.UserModel;
import com.yohesu.ultimate_retail.service.UserService;

@Controller
public class UserController {

    private ServletContext servletContext;

    public UserController(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Autowired
    private UserService userService;

    @GetMapping("/master/user/list-user")
    public String viewUserPage(Model model) {
        model.addAttribute("listOfUsers", userService.findAll());
        return "fragments/master/user/list-user";
    }

    @GetMapping("/master/user/view-add-user")
    public String viewAddUserPage(Model model) {
        Random rand = new Random();
        int randomValue = rand.nextInt(1000);
        String dateNow = new SimpleDateFormat("yyMMdd").format(Calendar.getInstance().getTime());
        String combineValue = dateNow + randomValue;
        UserModel user = new UserModel();
        user.setIdUser(Long.parseLong(combineValue));
        model.addAttribute("user", user);
        return "fragments/master/user/add-user";
    }

}
