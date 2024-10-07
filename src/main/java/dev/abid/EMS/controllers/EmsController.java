package dev.abid.EMS.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmsController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

}
