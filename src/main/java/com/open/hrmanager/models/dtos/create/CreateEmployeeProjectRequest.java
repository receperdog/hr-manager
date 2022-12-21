package com.open.hrmanager.models.dtos.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateEmployeeProjectRequest {
    private UUID employeeId;
    private UUID projectId;
}
