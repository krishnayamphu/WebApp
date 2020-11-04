package com.aptech.dao;

import com.aptech.models.User;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<User> allusers=UserDao.getUserByName("u");

        for (User u:allusers){
            System.out.println(u.getUsername()+", "+u.getPassword());
        }

    }
}
