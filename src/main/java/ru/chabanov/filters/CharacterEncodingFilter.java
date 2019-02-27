package ru.chabanov.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/main","/catalog","/product","/cart","/order"})
public class CharacterEncodingFilter extends HttpFilter {


    public final void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
         filterChain.doFilter(request, response);
    }
}
