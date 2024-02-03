package com.example.class_work;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Customer",urlPatterns = "/customer")
public class Customer extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getHeader("Fname");
        String lname = req.getHeader("Lname");
        String parameter = req.getParameter("value");
        String parameter1 = req.getParameter("value1");
        System.out.println(parameter+":" + fname);
        System.out.println(parameter1+":"+lname);
    }
}
