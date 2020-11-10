package com.aptech.controllers.media;

import com.aptech.helpers.MediaHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/del-image")
public class DeleteImageController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String image=request.getParameter("imageName");
        MediaHelper mediaHelper=new MediaHelper(getServletContext());
        if(mediaHelper.deleteMedia(image)){
            response.sendRedirect("http://localhost:8080/webapp/media");
        }else{
            PrintWriter pw=response.getWriter();
            pw.println("no such a file found !");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
