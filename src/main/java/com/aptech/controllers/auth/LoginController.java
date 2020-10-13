package com.aptech.controllers.auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if(username.equals("admin") && password.equals("a123")){
            HttpSession session=request.getSession();
            session.setAttribute("user",username);
            response.sendRedirect("http://localhost:8080/webapp/hello");
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("err","Invalid username or password");
            response.sendRedirect("http://localhost:8080/webapp/login");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("/login/index.jsp")
                .forward(request,response);
    }
}
