package com.aulmaster.Internal.Romadan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/mtdi",method = RequestMethod.GET)
public class MtdiController {

    @GetMapping("")
    public String indexMtdi(){
        return "mtdi/mtdi-index";
    }

}
