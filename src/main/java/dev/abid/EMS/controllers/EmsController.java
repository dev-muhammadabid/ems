package dev.abid.EMS.controllers;


import dev.abid.EMS.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmsController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/addEmp")
    public String addEmpForm(){
        return "addEmp";
    }

    @PostMapping
    public String empRegister(@ModelAttribute Employee emp){
        System.out.println(emp);
        return "";
    }

}
