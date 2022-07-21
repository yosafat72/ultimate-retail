package com.yohesu.ultimate_retail.controller.master;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yohesu.ultimate_retail.model.UserModel;
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

    @GetMapping("/master/user/view-add-user")
    public String viewAddUserPage(Model model) {
        Random rand = new Random();
        int randomValue = rand.nextInt(1000);
        String dateNow = new SimpleDateFormat("yyMMdd").format(Calendar.getInstance().getTime());
        String combineValue = dateNow + randomValue;
        UserModel user = new UserModel();
        user.setIdUser(Long.parseLong(combineValue));

        // Send to view
        model.addAttribute("user", user);
        return "fragments/master/user/add-user";
    }

    @PostMapping("/master/user/add-user")
    public String addUser(UserModel user) {
        userService.saveData(user);
        return "redirect:/master/user/list-user";
    }

    @GetMapping("/master/user/view-edit-user")
    public String viewEditUserPage(Model model, Long idUser) {
        model.addAttribute("user", userService.findById(idUser));
        return "fragments/master/user/edit-user";
    }

    @PostMapping("/master/user/edit-user")
    public String editUser(UserModel user) {
        userService.saveData(user);
        return "redirect:/master/user/list-user";
    }

    @GetMapping("/master/user/delete-user")
    public String deleteUser(Long idUser) {
        userService.deleteData(idUser);
        return "redirect:/master/user/list-user";
    }

}
