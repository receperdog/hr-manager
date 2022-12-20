package com.open.hrmanager.models.dtos.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDepartmentRequest {
    private UUID id;
    private String name;
}
