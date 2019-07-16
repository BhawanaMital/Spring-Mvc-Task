package com.stakeroute.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    User user=new User("Bhawana");
    @RequestMapping("/")
   public ModelAndView display(){

        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("name",user.getUsername());
        return mv;
    }


    @Override
    public String toString() {
        return "UserController{" +
                "user=" + user +
                '}';
    }
}
