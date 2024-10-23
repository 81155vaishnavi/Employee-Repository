package com.iptech.EmployeeDetails.model;

import com.iptech.EmployeeDetails.Client.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String email;
	private String eusername;
	private String epassword;
	private String eprofile;

	
	@Enumerated(EnumType.STRING)
	private UserType usertype;
}
