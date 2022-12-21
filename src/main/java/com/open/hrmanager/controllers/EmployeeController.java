package com.open.hrmanager.controllers;

import com.open.hrmanager.models.Employee;
import com.open.hrmanager.models.dtos.create.CreateEmployeeRequest;
import com.open.hrmanager.models.dtos.update.UpdateEmployeeRequest;
import com.open.hrmanager.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/createemployee")
    public Employee createEmployee(@RequestBody CreateEmployeeRequest employee) {
        return employeeService.createEmployee(employee);
    }
    @GetMapping("/getall")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/getbyname/{name}")
    public Employee getEmployeeByName(@PathVariable("name") String name) {
        return employeeService.getEmployeeByName(name);
    }
    @GetMapping("/getbysurname/{surname}")
    public Employee getEmployeeBySurname(@PathVariable("surname") String surname) {
        return employeeService.getEmployeeBySurname(surname);
    }
    @GetMapping("/getbyid/{id}")
    public Employee getEmployeeById(@PathVariable("id") UUID id) {
        return employeeService.getEmployeeById(id);
    }
    @PutMapping("/update")
    public void updateEmployee(@RequestBody UpdateEmployeeRequest employee) {
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") UUID id) {
        employeeService.deleteEmployee(id);
    }


}
