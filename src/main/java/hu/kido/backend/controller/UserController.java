package hu.kido.backend.controller;

import hu.kido.backend.dto.CreateUserRequest;
import hu.kido.backend.dto.UpdateUserRequest;
import hu.kido.backend.entity.User;
import hu.kido.backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody UpdateUserRequest request) {
        return userService.updateUser(id, request);
    }

    @GetMapping("/{id}")
    public User findUser (@PathVariable Long id){
        return userService.findUser(id);
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

}

