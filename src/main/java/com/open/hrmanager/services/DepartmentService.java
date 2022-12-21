package com.open.hrmanager.services;

import com.open.hrmanager.models.Department;
import com.open.hrmanager.models.dtos.create.CreateDepartmentRequest;
import com.open.hrmanager.models.dtos.update.UpdateDepartmentRequest;
import com.open.hrmanager.repositories.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final ModelMapper modelMapper;
    public Department createDepartment(CreateDepartmentRequest createDepartmentRequest) {
        Department department = modelMapper.map(createDepartmentRequest, Department.class);
        return departmentRepository.save(department);
    }
    public Department getDepartmentById(UUID id) {
        return departmentRepository.findById(id).orElse(null);
    }
    public void updateDepartment(UpdateDepartmentRequest updateDepartmentRequest) {
        Department department = modelMapper.map(updateDepartmentRequest, Department.class);
        departmentRepository.save(department);
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    public void deleteDepartmentById(UUID id) {
        departmentRepository.deleteById(id);
    }
}
