package com.aptech.dao;

import com.aptech.helpers.Database;
import com.aptech.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static Connection con = Database.connect();

    //return all users
    public static List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();

        //sql statement
        String sql = "SELECT * FROM users";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //retrieving individual records
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                allUsers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return resultset from exe query
        return allUsers;
    }

    //delete user
    public static int deleteUser(int userId) {
        //sql statement
        String sql = "DELETE FROM users WHERE id=?";
        int status = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            status = ps.executeUpdate(); //1/0
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;

    }

    //save user
    public static boolean save(User user) {
        boolean status = false;
        int check = 0;

        //sql statement
        String sql = "INSERT INTO users(username,password) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            check = ps.executeUpdate(); //1/0
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (check == 1) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    //get user by id
    public static User getUserById(int userId) {
        User user = null;
        //sql statement
        String sql = "SELECT * FROM users WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    //update user by id
    public static int update(User user) {
        int status = 0;
        //sql statement
        String sql = "UPDATE users SET username=?,password=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getId());
            status = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    //return total no. of users
    public static int getTotalUser(){
        int total=0;
        //sql statement
        String sql = "SELECT COUNT(username) from users";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            rs.next();
            total=rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }

    //return all users
    public static List<User> getUserByName(String username) {
        List<User> allUsers = new ArrayList<>();

        //sql statement
        String sql = "SELECT * FROM users WHERE username LIKE '" +username+"%'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //retrieving individual records
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                allUsers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return resultset from exe query
        return allUsers;
    }


}
