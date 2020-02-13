package com.example.Tajseer.Controller;

import com.example.Tajseer.View.ServiceImplmation;
import com.example.Tajseer.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Service
public class UserController extends ServiceImplmation {
    @Autowired
    private ServiceImplmation sevice;

    @Override
    @PostMapping(value = "/Post")
    public Users addUsers(@RequestBody Users users) {
        return sevice.addUsers(users);
    }

    @Override
    @GetMapping(value = "/getUser")
    public List<Users> getAllUsers() {
        return sevice.getAllUsers();
    }

    @Override
    @GetMapping(value="/{id}")
    public Users getUsers(@PathVariable("id") int id) {
        return sevice.getUsers(id);
    }

    @Override
    @PutMapping(value="/{id}")
    public Users updateUsers(@RequestBody Users users,@PathVariable("id")int id) {
        return sevice.updateUsers(users,id);
    }

    @Override
    @DeleteMapping(value="{/id}")
    public void deletedUsers(@PathVariable("id") int id) {
        sevice.deletedUsers(id);
    }
}
