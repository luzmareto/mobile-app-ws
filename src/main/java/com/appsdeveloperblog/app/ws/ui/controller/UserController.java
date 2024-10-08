package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page") int page,
                           @RequestParam(value = "limit") int limit)
    {
        return  "get user was called with page = " +page + " and limit " + limit;
    }

    @GetMapping(path="/{userId}")
    public String getUser(@PathVariable String userId)
    {
        return  "get user was called with userId = " + userId;
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
