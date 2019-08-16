package com.hcl.springbootdemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.springbootdemo.Dao.EmployeeRepository;
import com.hcl.springbootdemo.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	@Override
	public Optional<Employee> getByIdemployee(Long eid) {
		// TODO Auto-generated method stub
		return employeerepository.findById(eid);
	}

	@Override
	public Employee employeesave(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}

	@Override
	public Employee employeeupdate(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.saveAndFlush(employee);
	}

	@Override
	public void deleteemployee(Long eid) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(eid);
		
	}
	


}
