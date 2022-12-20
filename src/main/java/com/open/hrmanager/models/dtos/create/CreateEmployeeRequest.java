package com.open.hrmanager.models.dtos.create;

import com.open.hrmanager.models.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String salary;
    private String startDate;
    private String endDate;
    private boolean isActive;
    private UUID departmentId;
    @Enumerated(EnumType.ORDINAL)
    private Role role;
}
