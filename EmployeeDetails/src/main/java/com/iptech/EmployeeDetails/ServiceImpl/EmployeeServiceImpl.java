package com.iptech.EmployeeDetails.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iptech.EmployeeDetails.Repository.EmployeeRepository;
import com.iptech.EmployeeDetails.ServiceI.EmployeeServiceI;
import com.iptech.EmployeeDetails.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	EmployeeRepository er;
	
	@Override
	public Employee saveEmployee(Employee e) {
		
		return er.save(e);
	}

	@Override
	public void deleteEmployee(int eid) {
		
		er.deleteById(eid);
		
	}

	@Override
	public void editEmployee(int eid, Employee e) {
		Employee  ee=er.findById(eid).get();
		
		if(null != er)
		{
			ee.setEid(ee.getEid());
			ee.setEname(ee.getEname());
			ee.setEmail(ee.getEmail());
			ee.setEusername(ee.getEusername());
			ee.setEpassword(ee.getEpassword());
			ee.setEprofile(ee.getEprofile());
			ee.setUsertype(ee.getUsertype());
			er.save(ee);
		}
		else
		{
			System.out.println("data is not present..!");
		}
		
	}

	@Override
	public Employee getEmployee(String eusername) {
		  Employee emp=er.findByEusername(eusername);
		return emp;
	}

	@Override
	public Employee loginCheck(String eusername, String epassword) {
		Employee emp=er.findByEusernameAndEpassword(eusername,epassword);
		return emp;
	}
	
	



}
