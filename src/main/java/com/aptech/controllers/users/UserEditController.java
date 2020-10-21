package com.aptech.controllers.users;

import com.aptech.dao.UserDao;
import com.aptech.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/edit")
public class UserEditController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId=Integer.parseInt(request.getParameter("userId"));
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        User user =new User();
        user.setId(userId);
        user.setUsername(username);
        user.setPassword(password);

        int status=UserDao.update(user);
        response.sendRedirect("/webapp/users/edit?userId="+userId);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId=Integer.parseInt(request.getParameter("userId"));
        User user= UserDao.getUserById(userId);
        request.setAttribute("user",user);
        request.getRequestDispatcher("edit.jsp").forward(request,response);
    }
}
