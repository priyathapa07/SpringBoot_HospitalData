package com.hospitalrecord.springboot.daphehmis.user.controller;

import com.mh.trektrekker.daphehmis.enums.UserType;
import com.mh.trektrekker.daphehmis.user.entity.User;
import com.mh.trektrekker.daphehmis.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")  //endpoint hit
    public String getWelcomePage(ModelMap map) { //user side ma define  object map and key value pair

        map.put("userTypes", UserType.values()); // array // can be taken in view

        map.put("users", userService.findUsers()); //datatable (list user)
        //to show the users in the view/form ma, we use the action=modelattribute

        return "welcome"; //string welcome; resolver ley welcome.html (view)
    }

    @PostMapping("/")
    //object ko attribute make and that attribute  we map it
    //user object form value-> map  use modelAttribute
    public String getRegisterUser(@ModelAttribute User user) { //view/form ma vaako input type field ko value java mapping
        userService.save(user);

        return "redirect:/";
    }




}
