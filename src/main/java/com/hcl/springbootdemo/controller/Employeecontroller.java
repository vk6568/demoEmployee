package com.hcl.springbootdemo.controller;

import java.util.List;
import java.util.Optional;

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

import com.hcl.springbootdemo.Entity.Employee;
import com.hcl.springbootdemo.Service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class Employeecontroller {
	
	
	@Autowired
	private EmployeeServiceImpl employeeservice;
	
	
	@GetMapping("/all")
	public ResponseEntity getAllUser() {
		List<Employee> employee = employeeservice.getall();
		return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity Employeesave(@RequestBody Employee employee) {
		
		employeeservice.employeesave(employee);
	    return new ResponseEntity<String>("Success", HttpStatus.OK);
			
	}
	
	@PutMapping("/update")
	public ResponseEntity Employeeupdate(@RequestBody Employee employee) {
		
		employeeservice.employeeupdate(employee);
	    return new ResponseEntity<String>("Success", HttpStatus.OK);
			
	}
    @DeleteMapping("/delete/{eid}")
	public ResponseEntity DeleteEmployee(@PathVariable Long eid) {
		
		employeeservice.deleteemployee(eid);
	    return new ResponseEntity<String>("Delete id", HttpStatus.OK);
		
		
	}
	@GetMapping("/getid/{eid}")
	public ResponseEntity getbyidemployee(@PathVariable Long eid) {
		
		Optional<Employee> employee = employeeservice.getByIdemployee(eid);
		return new ResponseEntity<Optional<Employee>>(employee, HttpStatus.OK);
	}
	

}
