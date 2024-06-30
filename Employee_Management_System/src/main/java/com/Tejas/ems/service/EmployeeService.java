package com.Tejas.ems.service;

import java.util.List;
import com.Tejas.ems.entity.Employee;
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
