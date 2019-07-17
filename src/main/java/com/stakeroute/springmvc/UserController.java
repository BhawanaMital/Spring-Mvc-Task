package com.stakeroute.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping(value = "/login")
    public ModelAndView display(HttpServletRequest request)
    {
        String i=request.getParameter("name");
        String j=request.getParameter("password");;

        ModelAndView mv=new ModelAndView("display");
        mv.addObject("result",i);

        //Using ModelAndView we can send view along with object
        return mv;//new ModelAndView("welcome","name",user.getName());

    }
}

