package com.open.hrmanager.services;

import com.open.hrmanager.models.Employee;
import com.open.hrmanager.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    public Employee getEmployeeById(UUID id) {
        return employeeRepository.findById(id).orElse(null);
    }
    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);
    }
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }
    public Employee getEmployeeBySurname(String surname) {
        return employeeRepository.findEmployeeBySurname(surname);
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
