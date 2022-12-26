package com.open.hrmanager.controllers;

import com.open.hrmanager.models.Role;
import com.open.hrmanager.models.dtos.create.CreateRoleRequest;
import com.open.hrmanager.services.RoleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

/**
 * Created by erdogan on 27-Dec-22
 *
 * @author : erdogan
 * @date : 27-Dec-22
 * @project hr-manager
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/roles")
public class RoleController {
    private final RoleService roleService;
    @PostMapping("/create")
    public Role createRole(@RequestBody CreateRoleRequest createRoleRequest) {
        return roleService.createRole(createRoleRequest);
    }
    @GetMapping("/getall")
    public Iterable<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

}
