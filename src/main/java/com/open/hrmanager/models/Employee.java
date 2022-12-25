package com.open.hrmanager.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID employeeId;

    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String salary;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;
    @ManyToOne
    private Department department;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Project> projects;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "employee_roles",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
