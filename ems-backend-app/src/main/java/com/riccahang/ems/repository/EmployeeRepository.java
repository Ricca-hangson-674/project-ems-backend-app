package com.riccahang.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riccahang.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
