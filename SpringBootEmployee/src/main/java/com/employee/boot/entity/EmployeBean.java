package com.employee.boot.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Employee_table")
public class EmployeBean {
	
	
@Id
@GeneratedValue
 private int employeeId;
 private String employeeName;
 private String employeeLastName;
private String employeeEmail;
private long employeephoneNumber;
@DateTimeFormat(pattern="dd/MM/yyyy")
private Date employeeJoinDate;
private double employeeSalary;

}
