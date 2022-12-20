package com.open.hrmanager.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID projectId;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "department_id" )
    private Department department;
    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;
}
