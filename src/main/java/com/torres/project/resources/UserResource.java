package com.torres.project.resources;

import com.torres.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value ="/users")
public class UserResource {
    // Retornar o usuário
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User (1L, "Maria", "Maria@gmail.com", "9999999", "password");
        return ResponseEntity.ok().body(u);
    }

}
