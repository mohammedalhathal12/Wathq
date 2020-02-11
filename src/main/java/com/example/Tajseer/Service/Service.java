package com.example.Tajseer.Service;


import com.example.Tajseer.Model.Users;

import java.util.List;

public  interface Service {
    public Users addUsers(Users student);

    List<Users> getAllUsers();
    public Users getUsers(int id);
    public void  deletedUsers(int id);
    public Users updateUsers(Users Org,int id);

}