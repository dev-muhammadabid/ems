package dev.abid.EMS.services;

import dev.abid.EMS.entities.Employee;
import dev.abid.EMS.repositories.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public void addEmp(Employee emp){
        empRepo.save(emp);
    }
}
