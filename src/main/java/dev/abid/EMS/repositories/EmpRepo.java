package dev.abid.EMS.repositories;

import dev.abid.EMS.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
