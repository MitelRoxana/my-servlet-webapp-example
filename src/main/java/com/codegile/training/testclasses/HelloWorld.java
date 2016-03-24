package com.codegile.training.testclasses;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Created by Roxana on 23.03.2016.
 */
@WebServlet(name = "myservlet",
        urlPatterns = {"/myservlet"})
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello pisi!!";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        this.message = "Salut, bine ai venit," + request.getParameter("name");
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");

    }

    public void destroy()
    {
        // do nothing.
    }
}