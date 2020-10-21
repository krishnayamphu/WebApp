package com.aptech.controllers.users;

import com.aptech.dao.UserDao;
import com.aptech.helpers.Database;
import com.aptech.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/users")
public class UserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int userId=Integer.parseInt(request.getParameter("userid"));

        int status=UserDao.deleteUser(userId);

        PrintWriter pw=response.getWriter();
        if(status==1){
            pw.println("User deleted successfully.");
            response.sendRedirect("/webapp/users");
        }else {
            pw.println("Sorry !, User can't delete.");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> allusers= UserDao.getAllUsers();

        request.setAttribute("userlist",allusers);

        request.getRequestDispatcher("/users/index.jsp").forward(request,response);
    }
}
