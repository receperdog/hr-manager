package com.open.hrmanager.models.dtos.create;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateProjectRequest {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status;
    private UUID departmentId;
}
