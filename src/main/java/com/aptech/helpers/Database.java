package com.aptech.helpers;

import java.sql.*;

public class Database {
//    create table users(id int primary key auto_increment, username varchar(20) unique not null, password varchar(256));
    private static Connection con;

    public static Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbaptech?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
