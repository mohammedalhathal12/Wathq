package com.example.Tajseer.View;

import com.example.Tajseer.Model.Users;
import com.example.Tajseer.Repostiry.RepUser;
import com.example.Tajseer.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImplmation implements Service {

@Autowired
    private RepUser rep;
    @Override
    public Users addUsers(Users users){
     return rep.save(users);

    }

    @Override
    public List<Users> getAllUsers() {
        return rep.findAll();
    }

    @Override
    public Users getUsers(int id) {
        return rep.findById(id).get();
    }
    @Override
    public void deletedUsers(int id) {
         rep.deleteById(id);
    }

    @Override
    public Users updateUsers(Users users, int id) {
                users.setId(id);
        return rep.save(users);
    }


}
