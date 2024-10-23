package com.iptech.EmployeeDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.iptech.EmployeeDetails.ServiceI.EmployeeServiceI;
import com.iptech.EmployeeDetails.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI esi;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addData(@RequestBody Employee e)
	{
		Employee ee=esi.saveEmployee(e);
		return new ResponseEntity<Employee>(ee,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/del/{eid}")
	public ResponseEntity<String> deleteData(@PathVariable int eid)
	{
		esi.deleteEmployee(eid);
		return new ResponseEntity<String>("delete data",HttpStatus.CREATED);
	}
	
	@PutMapping("/edit/{eid}")
	public ResponseEntity<String> updateData(@PathVariable int eid,@RequestBody Employee e)
	{
		esi.editEmployee(eid,e);
		return new ResponseEntity<String>("data updated",HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmployee/{eusername}")
	public ResponseEntity<Employee> getEmployee(@PathVariable String eusername)
	{

	  Employee emp=   esi.getEmployee(eusername);
      return new ResponseEntity<Employee>(emp,HttpStatus.OK);

	}

	@GetMapping("/getEmployeee/{eusername}/{epassword}")
	public ResponseEntity<Employee> loginCheck(@PathVariable String eusername,@PathVariable String epassword)
	{

	  Employee emp =  esi.loginCheck(eusername,epassword);
	  return new ResponseEntity<Employee>(emp,HttpStatus.OK);

	}

}
