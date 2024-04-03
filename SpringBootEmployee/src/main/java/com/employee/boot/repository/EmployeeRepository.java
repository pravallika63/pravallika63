package com.employee.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.boot.entity.EmployeBean;

public interface EmployeeRepository extends JpaRepository<EmployeBean,Integer> {

}
