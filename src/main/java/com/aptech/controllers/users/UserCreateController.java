package com.aptech.controllers.users;

import com.aptech.dao.UserDao;
import com.aptech.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/users/create")
public class UserCreateController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    User user =new User();
    user.setUsername(username);
    user.setPassword(password);
    PrintWriter pw=response.getWriter();
    if(UserDao.save(user)){
        pw.println("save success");
        response.sendRedirect("/webapp/users");
    }else{
        pw.println("error in registration");
        response.sendRedirect("/webapp/users/create");
    }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("create.jsp").forward(request,response);
    }
}
