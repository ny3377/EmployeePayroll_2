package com.example.PayrollApp.service;

import com.example.PayrollApp.dto.EmployeeDTO;
import com.example.PayrollApp.model.Employee;
import java.util.*;

public interface EmployeeService {
    Employee createEmployee(EmployeeDTO dto);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, EmployeeDTO dto);
    void deleteEmployee(int id);
}
