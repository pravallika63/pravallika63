package com.employee.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.employee.boot.entity.EmployeBean;
import com.employee.boot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public EmployeBean addEmployee(@RequestBody EmployeBean employee) {
		return service.saveEmployee(employee);
	}
	
	@PostMapping("/addEmployees")
	public List<EmployeBean> addEmployees(@RequestBody List<EmployeBean> employees){
		return service.saveEmployee(employees);
		
	}
	
	@GetMapping("/employees")
	public List<EmployeBean> findAllEmployees(){
		return service.getEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public EmployeBean findEmployeeById(@PathVariable int id) {
		return service.getEmployeesById(id);
		
	}
	
	@GetMapping("/{employeeId}/tax")
    public TaxDetails getEmployeeTaxDetails(@PathVariable int employeeId) {
        EmployeBean employee = service.getEmployeesById(employeeId);
        double taxAmount = service.calculateTax(employee);
        double cessAmount = taxAmount * 0.04; // Assuming 4% cess on tax

        return new TaxDetails(
                employee.getEmployeeId(),
                employee.getEmployeeName(),
                employee.getEmployeeLastName(),
                employee.getEmployeeSalary()* 12,
                taxAmount,
                cessAmount
        );
	}
	
	@PutMapping("/update")
	public EmployeBean updateEmployee(@RequestBody EmployeBean employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}
