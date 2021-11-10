package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.User;
import com.fran.AppOneOne.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/selectalluser")
    public List<User> selectAllUser() {
        return userService.selectAllUser();
    }
    @GetMapping("/selectalluserby/{id}")
    public User selectAllUserById(@PathVariable int id) {
        return userService.selectAllUserById(id);
    }
    @PostMapping("/insertuser")
    public void insertUser(@RequestBody User nuevoUser) {
        userService.insertUser(nuevoUser);
    }
    @PutMapping("/updateuserbyid")
    public void updateUserById(@RequestBody User updateUser) {
        userService.updateUserById(updateUser);
    }
    @DeleteMapping("/delectuserby/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUserById(id);
    }
}
