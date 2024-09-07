package lk.ijse.jakartaeeintro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/test")
public class Test extends HttpServlet {

    int number01 = 10;
    int number02 = 15;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(req.getParameter("check01"));
        System.out.println(req.getParameter("check02"));

        int check01 = Integer.parseInt(req.getParameter("check01")) + number01;
        if (check01 % 2 == 0) {
            resp.getWriter().println("Even");
        } else {
            resp.getWriter().println("Odd");
        }

        int check02 = Integer.parseInt(req.getParameter("check01")) + number02;
        if (check02 % 2 == 0) {
            resp.getWriter().println("Even");
        } else {
            resp.getWriter().println("Odd");
        }
        resp.getWriter().close();
    }
}
