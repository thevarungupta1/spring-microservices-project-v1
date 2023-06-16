package com.thevarungupta.employee.service.dto;

import com.thevarungupta.employee.service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

//@Entity - don't use entity annotation otherwise it will create department table in this service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDepartmentResponse {
    private Employee employee;
    private Department department;
}
