package ru.chabanov.utils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintPages {
   public static void printPageHTML(HttpServletRequest req, HttpServletResponse resp, String path) throws IOException, ServletException {
        try (PrintWriter out = resp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>"+path+"</title>");
            out.println("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='text-align:center;'>"+path+"</h1>");
            out.println("<nov>\n" +
                    "<a href=\"./main\">Главная | </a>\n" +
                    "<a href=\"./catalog\">Каталог | </a>\n" +
                    "<a href=\"./product\">Продукт | </a>\n" +
                    "<a href=\"./cart\">Карзина | </a>\n" +
                    "<a href=\"order\">Заказ</a>\n" +
                    "</nov>");
            out.println("</body>");
            out.println("</html>");


        }
    }
}
