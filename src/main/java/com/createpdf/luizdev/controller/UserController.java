package com.createpdf.luizdev.controller;

import com.createpdf.luizdev.model.User;
import com.createpdf.luizdev.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    public final UserService userService;

    @GetMapping("/allUsers")
    public List<User> getAll() { return userService.getAll(); }

    @GetMapping("/{id}")
    public User getUserId(@PathVariable Long id) { return userService.getUserId(id); }

    @PostMapping("/createAll")
    public List<User> createAllUsers(@RequestBody List<User> users) { return userService.createMultipleUsers(users); }

    @PostMapping("/createUnique")
    public User createUserUnique(@RequestBody User user) { return userService.createUser(user); }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) { userService.deleteUserById(id); }

    @PutMapping("/edit/{id}")
    public User editUser(@PathVariable Long id, @RequestBody User newUser) { return userService.modifyUser(id, newUser); }
}