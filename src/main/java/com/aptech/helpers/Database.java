package com.aptech.helpers;

import java.sql.*;

public class Database {
//    create table users(id int primary key auto_increment, username varchar(20) unique not null, password varchar(256));
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbaptech?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            System.out.println("Server connected successfully.");

            String sql="SELECT * FROM users";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt("id")+", "+rs.getString("username"));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
