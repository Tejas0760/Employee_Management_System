package com.Tejas.ems.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Tejas.ems.entity.Employee;
import com.Tejas.ems.repository.EmployeeRepository;
import com.Tejas.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }
    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}

