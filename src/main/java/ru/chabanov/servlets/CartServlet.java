package ru.chabanov.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.chabanov.utils.PrintPages.printPageHTML;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(Class.class.getCanonicalName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        printPageHTML(req,resp,"Карзина");
    }
}
