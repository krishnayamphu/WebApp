package com.aptech.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hidden-form")
public class HiddenFormController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String token=request.getParameter("token");
        String text=request.getParameter("mytext");

        PrintWriter pw=response.getWriter();
        pw.println(token);
        pw.println(text);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("myform.jsp").forward(request,response);
    }
}
