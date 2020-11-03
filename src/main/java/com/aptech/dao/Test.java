package com.aptech.dao;

import com.aptech.models.User;

public class Test {
    public static void main(String[] args) {

        int total=UserDao.getTotalUser();
        System.out.println("total users: "+total);

    }
}
