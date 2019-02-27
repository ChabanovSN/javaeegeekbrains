package ru.chabanov.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/","/main","/catalog"})
public class Controller extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info(" processRequest() in Controller.class");

        response.setContentType("text/html;charset=UTF-8");
        String url = "WEB-INF/";
        if (request.getServletPath().equals("/") || request.getServletPath().equals("/main")){
            url +="index.jsp";
        } else if (request.getServletPath().equals("/product")){
            url+="product.jsp";
        }else if (request.getServletPath().equals("/catalog")){
            url+="catalog.jsp";
        }else if (request.getServletPath().equals("/cart")){
            url+="cart.jsp";
        }
        request.getRequestDispatcher(url).forward(request, response);
    }
}
