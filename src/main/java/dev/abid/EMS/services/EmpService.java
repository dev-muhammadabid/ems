package dev.abid.EMS.services;

import dev.abid.EMS.entities.Employee;
import dev.abid.EMS.repositories.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public void addEmp(Employee emp){
        empRepo.save(emp);
    }

    public List<Employee> getAllEmp(){
        return empRepo.findAll();
    }

    public Employee getEmpById(int id){
        Optional <Employee> emp = empRepo.findById(id);
        if (emp.isPresent()){
            return emp.get();
        }
        return null;
    }

    public void deleteEmp(int id){
        empRepo.deleteById(id);
    }
}
