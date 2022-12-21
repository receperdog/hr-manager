package com.open.hrmanager.controllers;

import com.open.hrmanager.models.Department;
import com.open.hrmanager.models.dtos.create.CreateDepartmentRequest;
import com.open.hrmanager.models.dtos.update.UpdateDepartmentRequest;
import com.open.hrmanager.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("/createdepartment")
    public Department createDepartment(@RequestBody CreateDepartmentRequest createDepartmentRequest) {
        return departmentService.createDepartment(createDepartmentRequest);
    }
    @GetMapping("/getall")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
    @GetMapping("/getbyid/{id}")
    public Department getDepartmentById(@PathVariable("id") UUID id) {
        return departmentService.getDepartmentById(id);
    }
    @PutMapping("/update")
    public void updateDepartment(@RequestBody UpdateDepartmentRequest updateDepartmentRequest) {
        departmentService.updateDepartment(updateDepartmentRequest);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable("id") UUID id) {
        departmentService.deleteDepartmentById(id);
    }
}
