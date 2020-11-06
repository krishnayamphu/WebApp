package com.aptech.controllers.media;

import com.aptech.helpers.MediaHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/images")
public class ImageController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MediaHelper mediaHelper=new MediaHelper(getServletContext());
        List<String> images=mediaHelper.getMediaList();
        PrintWriter pw=response.getWriter();
        request.setAttribute("images",images);

        request.getRequestDispatcher("media.jsp").forward(request,response);
    }
}
