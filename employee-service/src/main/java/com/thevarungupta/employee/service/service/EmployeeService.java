package com.thevarungupta.employee.service.service;

import com.thevarungupta.employee.service.dto.EmployeeDepartmentResponse;
import com.thevarungupta.employee.service.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long employeeId);
    Employee saveEmployee(Employee newEmployee);
    EmployeeDepartmentResponse getEmployeeWithDepartment(Long employeeId);
}
