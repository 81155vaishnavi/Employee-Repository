package com.iptech.EmployeeDetails.ServiceI;

import com.iptech.EmployeeDetails.model.Employee;

public interface EmployeeServiceI {

	public Employee saveEmployee(Employee e);

	public void deleteEmployee(int eid);

	public void editEmployee(int eid, Employee e);


	public Employee getEmployee(String eusername);

	public Employee loginCheck(String eusername, String epassword);

}
