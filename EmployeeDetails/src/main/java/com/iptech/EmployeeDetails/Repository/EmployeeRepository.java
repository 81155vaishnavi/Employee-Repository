package com.iptech.EmployeeDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iptech.EmployeeDetails.model.Employee;
import java.util.List;




@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


   public Employee findByEusername(String eusername);
   public Employee findByEusernameAndEpassword(String eusername, String epassword);

}
