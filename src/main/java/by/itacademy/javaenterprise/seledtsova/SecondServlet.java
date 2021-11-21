package by.itacademy.javaenterprise.seledtsova;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", urlPatterns = {"/second"})
public class SecondServlet extends HttpServlet {

    private Long countsVisitsGet;
    private Long countsVisitsPost;

    @Override
    public void init() throws ServletException {
        countsVisitsGet = 0L;
        countsVisitsPost = 0L;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        try {
            countsVisitsGet++;
            printWriter.write("<p><span style='color: blue;'>Second Servlet with annotation</span></p>");
            printWriter.write("<h2><span style='color: blue;'>Total counts (doGet methods) = " + countsVisitsGet + "</span></h2>");
            printWriter.println("<h3><span style='color: orange;'>Stream name is  " + Thread.currentThread().getName() + "</span></h3>");
        } finally {
            printWriter.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        try {
            countsVisitsGet++;
            printWriter.write("<p><span style='color: blue;'>Total counts (doPost methods) =" + countsVisitsPost + "</span></p>");
            printWriter.println("<h2><span style='color: orange;'>Stream name is  " + Thread.currentThread().getName() + "</span></h2>");
        } finally {
            printWriter.close();
        }
    }
}


