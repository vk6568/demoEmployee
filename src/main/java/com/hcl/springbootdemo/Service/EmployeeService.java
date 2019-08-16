package com.hcl.springbootdemo.Service;



import java.util.List;
import java.util.Optional;

import com.hcl.springbootdemo.Entity.Employee;

public interface EmployeeService {
	
	List<Employee> getall();
	Optional<Employee> getByIdemployee(Long eid);
	Employee employeesave(Employee employee);
	Employee employeeupdate(Employee  employee);
	void deleteemployee(Long eid);

}
