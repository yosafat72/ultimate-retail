package com.yohesu.ultimate_retail.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @GetMapping("/master/category/list-category")
    public String viewCategoryPage(){
        return "fragments/master/category/list-category";
    }

}
