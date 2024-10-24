package dev.abid.EMS.controllers;


import dev.abid.EMS.entities.Employee;
import dev.abid.EMS.services.EmpService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmsController {

    @Autowired
    private EmpService empService;

    @GetMapping("/")
    public String home(Model m){
        List<Employee>emp = empService.getAllEmp();
        m.addAttribute("emp", emp);

        return "index";

    }

    @GetMapping("/addEmp")
    public String addEmpForm(){
        return "addEmp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee emp, HttpSession session) {
        empService.addEmp(emp);
        session.setAttribute("msg", "Employee Added Successfully");
        return "redirect:/";
    }

    @GetMapping("/editEmp/{id}")
    public String editEmp(@PathVariable int id, Model m){

        Employee e = empService.getEmpById(id);

        m.addAttribute("emp", e);

        return "editEmp";
    }

    @PostMapping("/update")
    public  String updateEmp(@ModelAttribute Employee emp, HttpSession session){
        empService.addEmp(emp);
        session.setAttribute("msg", "Employee Details Update Successfully");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id, HttpSession session){
        empService.deleteEmp(id);
        session.setAttribute("msg", "Employee Data Delete Successfully");
        return "redirect:/";
    }

}
