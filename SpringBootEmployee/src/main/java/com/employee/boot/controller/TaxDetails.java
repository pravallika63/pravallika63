package com.employee.boot.controller;

import java.util.Date;

import com.employee.boot.entity.EmployeBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxDetails {

	private int employeeId;
    private String employeeName;
    private String employeeLastName;
    private double employeeSalary;
    private double taxAmount;
    private double cessAmount;

	
	
}
