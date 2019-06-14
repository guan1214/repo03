package com.controller;

import com.domain.User;
import com.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceInter userServiceInter;
    @RequestMapping("/findA")
    public ModelAndView findUserById(ModelAndView modelAndView){

        System.out.println("nimade ");
      User user=  userServiceInter.findUserById(1);

      modelAndView.addObject("user",user);
      modelAndView.setViewName("User");

        return modelAndView;
    }

}
