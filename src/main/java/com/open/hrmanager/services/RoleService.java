package com.open.hrmanager.services;

import com.open.hrmanager.models.Role;
import com.open.hrmanager.models.dtos.create.CreateRoleRequest;
import com.open.hrmanager.repositories.RoleRepository;
import lombok.AllArgsConstructor;
import org.hibernate.sql.Update;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by erdogan on 27-Dec-22
 *
 * @author : erdogan
 * @date : 27-Dec-22
 * @project hr-manager
 */
@Service
@AllArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;
    public Role createRole(CreateRoleRequest role) {
        Role role1 = modelMapper.map(role, Role.class);
        return roleRepository.save(role1);
    }
    public Role getRoleById(UUID id) {
        return roleRepository.findById(id).orElse(null);
    }
    public Role getRoleByRole(String role) {
        return roleRepository.findByRole(role).orElse(null);
    }
    public void deleteRole(UUID id) {
        roleRepository.deleteById(id);
    }
    public Iterable<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
