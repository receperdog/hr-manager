package com.open.hrmanager.services;

import com.open.hrmanager.models.Employee;
import com.open.hrmanager.models.Project;
import com.open.hrmanager.models.dtos.create.CreateEmployeeProjectRequest;
import com.open.hrmanager.models.dtos.create.CreateEmployeeRequest;
import com.open.hrmanager.models.dtos.update.UpdateEmployeeRequest;
import com.open.hrmanager.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ProjectService projectService;
    private final ModelMapper modelMapper;
    public Employee createEmployee(CreateEmployeeRequest employeeRequest) {
        Employee employee = modelMapper.map(employeeRequest, Employee.class);
        return employeeRepository.save(employee);
    }
    public Employee getEmployeeById(UUID id) {
        return employeeRepository.findById(id).orElse(null);
    }
    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);
    }
    public void updateEmployee(UpdateEmployeeRequest updateEmployeeRequest) {
        Employee employee = modelMapper.map(updateEmployeeRequest, Employee.class);
        employeeRepository.save(employee);
    }
    public void assignProject(CreateEmployeeProjectRequest createEmployeeProjectRequest) {
        Employee employee = employeeRepository.findById(createEmployeeProjectRequest.getEmployeeId()).orElse(null);
        Project project = projectService.getProjectById(createEmployeeProjectRequest.getProjectId());
        employee.getProjects().add(project);
        employeeRepository.save(employee);
    }
//    public Employee getEmployeeByName(String name) {
//        return employeeRepository.findEmployeeByName(name);
//    }
//    public Employee getEmployeeBySurname(String surname) {
//        return employeeRepository.findEmployeeBySurname(surname);
//    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
