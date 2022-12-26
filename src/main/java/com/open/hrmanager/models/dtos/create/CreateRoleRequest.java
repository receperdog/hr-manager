package com.open.hrmanager.models.dtos.create;

import com.open.hrmanager.models.enums.RoleEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by erdogan on 27-Dec-22
 *
 * @author : erdogan
 * @date : 27-Dec-22
 * @project hr-manager
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateRoleRequest {
    @Enumerated(EnumType.STRING)
    private RoleEnum role;
}
