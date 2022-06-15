package com.bank.demo.controller;

import com.bank.demo.model.User;
import com.bank.demo.model.UserDTO;
import com.bank.demo.service.UserServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")

public class UserController {
    @Autowired
    ModelMapper modelMapper;

    private final UserServiceImpl userService;

    UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @PostMapping("/users")
    public ResponseEntity<Integer> createUserName(@Valid @RequestBody UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        return new ResponseEntity<Integer>(userService.createUserData(user), HttpStatus.CREATED);
    }

    private User convertToEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
