package com.asb.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.example.model.Employee;
import com.asb.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepository employeerRepository;
	
	@Override
	public Employee createEmployee(Employee emp) {
	
		 return employeerRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
	    return employeerRepository.save(emp);
	}

	@Override
    public Employee getEmployee(Long empId) {
        Optional<Employee> optionalEmp =  employeerRepository.findById(empId);
        if(optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
	
	@Override
	public List<Employee> getAllEmployee() {
	
		return employeerRepository.findAll();
	}

	@Override
	public void deleteEmployee(Long empId) {
		employeerRepository.deleteById(empId);		
	}

}
