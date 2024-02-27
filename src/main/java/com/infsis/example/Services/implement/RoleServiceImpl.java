package com.infsis.example.Services.implement;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.DTOs.RoleDTO;
import com.infsis.example.Models.Blog;
import com.infsis.example.Models.Role;
import com.infsis.example.Services.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public Optional<RoleDTO> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void delete(Integer roleId) {

    }

    private RoleDTO RoletoDto(Role role){
        RoleDTO roleDTO=new RoleDTO(
                role.getId(),
                role.getName()
        );
        return roleDTO;
    }

    private Role DtoToRole(RoleDTO roleDTO){
        Role role=new Role();
        role.setName(roleDTO.getName());

        return role;
    }
}
