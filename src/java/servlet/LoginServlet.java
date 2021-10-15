/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import service.AccountService;

/**
 *
 * @author 775262
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("logout") != null && session.getAttribute("user") != null) {
            request.setAttribute("logoutMessage", true);
            session.invalidate();
            session = request.getSession();
        }

        if (session.getAttribute("user") != null) {
            response.sendRedirect("home");
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("user-name");
        String password = request.getParameter("user-password");
        HttpSession session = request.getSession();
        User mUser = new AccountService().login(username, password);
        request.setAttribute("username", username);
        

        if (mUser == null) {
            request.setAttribute("invalidInput", true);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }

        session.setAttribute("user", mUser);
        response.sendRedirect("home");
        return;

    }

}
