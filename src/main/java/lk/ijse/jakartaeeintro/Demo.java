package lk.ijse.jakartaeeintro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*@WebServlet(value = "/health")*/
public class Demo extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Init called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Health Test  GET");
        System.out.println(req.getMethod());

        String initParameter = getServletContext().getInitParameter("add");
        String initParameter2 = getServletContext().getInitParameter("Dasun");
        System.out.println(initParameter);
        System.out.println(initParameter2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Health Test - POST");
        System.out.println(req.getMethod());
    }
}
