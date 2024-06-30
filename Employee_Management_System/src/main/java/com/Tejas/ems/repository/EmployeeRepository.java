package com.Tejas.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Tejas.ems.entity.Employee; 

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

} 
