package com.example.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
   // need a controller method to show inital HTML form
@RequestMapping("/showform")
    public String showForm(){
return "helloworld-form";
}

    //need a controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm(){
    return "helloworld";
    }


    // need a controller method tor read form data and
    //add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
    // read the rqquest parameter from the html form
    String theName = request.getParameter("studentName");
    // convert to the data all caps
    theName = theName.toUpperCase();
    // create a message
    String result = "yo!" +theName;
    // add  message to the model
    model.addAttribute("message",result);

        return "helloworld";
    }
}
