package com.thevarungupta.employee.service.service.impl;

import com.thevarungupta.employee.service.dto.Department;
import com.thevarungupta.employee.service.dto.EmployeeDepartmentResponse;
import com.thevarungupta.employee.service.entity.Employee;
import com.thevarungupta.employee.service.repository.EmployeeRepository;
import com.thevarungupta.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public Employee saveEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    @Override
    public EmployeeDepartmentResponse getEmployeeWithDepartment(Long employeeId) {
        // get employee
        Employee employee = employeeRepository.findById(employeeId).get();

        // get department
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/v1/departments/"+
                employee.getDepartmentId(), Department.class);

        // return merged response
        EmployeeDepartmentResponse response = new EmployeeDepartmentResponse();
        response.setDepartment(department);
        response.setEmployee(employee);
        return response;
    }
}
