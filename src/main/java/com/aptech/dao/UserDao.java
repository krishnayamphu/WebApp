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
    private static Connection con= Database.connect();

    //return all users
    public static List<User> getAllUsers(){
        List<User> allUsers=new ArrayList<>();

        //sql statement
        String sql="SELECT * FROM users";
        PreparedStatement ps= null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            //retrieving individual records
            while (rs.next()){
                User user=new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                allUsers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return resultset from exe query
        return  allUsers;
    }


    //delete user
    public static int deleteUser(int userId){
        //sql statement
        String sql="DELETE FROM users WHERE id=?";
        int status=0;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,userId);
            status=ps.executeUpdate(); //1/0
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;

    }
}
