package com.thevarungupta.employee.service.controller;

import com.thevarungupta.employee.service.dto.EmployeeDepartmentResponse;
import com.thevarungupta.employee.service.entity.Employee;
import com.thevarungupta.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}/department")
    public EmployeeDepartmentResponse getEmployeeWithDepartment(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeWithDepartment(employeeId);
    }
}
