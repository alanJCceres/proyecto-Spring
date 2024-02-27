package com.infsis.example.Services;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.DTOs.RoleDTO;

import java.util.Optional;

public interface RoleService {
    Optional<RoleDTO> getRoleById(Integer roleId);

    RoleDTO saveRole(RoleDTO role);

    RoleDTO updateRole(Integer roleId, RoleDTO role);
    void delete(Integer roleId);
}
