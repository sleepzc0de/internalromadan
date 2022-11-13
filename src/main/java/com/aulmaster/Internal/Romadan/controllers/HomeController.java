package com.aulmaster.Internal.Romadan.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "", method = RequestMethod.GET)
public class HomeController {

    @GetMapping("/")
    public String homeIndex(){
        return "home/home-index";
    }
}
