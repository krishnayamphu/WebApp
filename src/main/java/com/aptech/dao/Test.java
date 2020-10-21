package com.aptech.dao;

import com.aptech.models.User;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.setId(13);
        user.setUsername("user123");
        user.setPassword("uuuuuu");
        UserDao.update(user);

    }
}
