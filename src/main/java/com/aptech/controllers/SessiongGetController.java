package com.aptech.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionget")
public class SessiongGetController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        HttpSession session= request.getSession(false);
        if(session!=null){
            String name=(String)session.getAttribute("user");

            pw.print("Hello, "+name+" Welcome to Profile");
        }
        else{
            pw.print("Please login first");
            response.sendRedirect("http://localhost:8080/webapp/login");
             }

    }
}
