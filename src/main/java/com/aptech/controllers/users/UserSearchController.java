package com.aptech.controllers.users;

import com.aptech.dao.UserDao;
import com.aptech.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users/search")
public class UserSearchController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("search");
        List<User> users= UserDao.getUserByName(username);
        request.setAttribute("users",users);
        request.getRequestDispatcher("search.jsp").include(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.getRequestDispatcher("search.jsp").forward(request,response);
    }
}
