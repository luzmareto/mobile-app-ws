package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser()
    {
        return  "get user was called";
    }

    @PostMapping
    public String createUser()
    {
        return  "createUser user was called";
    }

    @PutMapping
    public String UpdateUser()
    {
        return  "UpdateUser user was called";
    }

    @DeleteMapping
    public String deleteUser()
    {
        return  "deleteUser user was called";
    }
}
