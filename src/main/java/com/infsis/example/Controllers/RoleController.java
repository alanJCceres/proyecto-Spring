package com.infsis.example.Controllers;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.DTOs.RoleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @GetMapping()
    public ResponseEntity<RoleDTO> getRoles(){
        RoleDTO role=new RoleDTO(1,"name");
        return ResponseEntity.ok().body(role);
    }
    @GetMapping("/{id}")
    public ResponseEntity<RoleDTO> getRole(@PathVariable Integer id){
        RoleDTO role=new RoleDTO(1,"name");
        return ResponseEntity.ok().body(role);
    }
    @PostMapping()
    public ResponseEntity<RoleDTO> saveRole(@RequestBody RoleDTO role){
        return ResponseEntity.ok().body(role);
    }
    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO> updateRole(@PathVariable Integer id,@RequestBody RoleDTO role){
        return ResponseEntity.ok().body(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id){

    }
}
