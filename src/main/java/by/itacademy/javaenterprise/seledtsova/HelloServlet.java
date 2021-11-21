package by.itacademy.javaenterprise.seledtsova;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private Long countsVisits;

    @Override
    public void init() throws ServletException {
        countsVisits = 0L;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        try {
            countsVisits++;
            printWriter.println("<h2><span style='color: blue;'>Number of visits with page =" + countsVisits + "</span></h2>");
            printWriter.println("<h2><span style='color: orange;'>Stream name is  " + Thread.currentThread().getName() + "</span></h2>");
        } finally {
            printWriter.close();
        }
    }
}


