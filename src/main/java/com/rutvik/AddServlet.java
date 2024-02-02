package com.rutvik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

//        + "" is used to append k into String
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);

		res.sendRedirect("Square");

//		PrintWriter out = res.getWriter();
//		out.println("result value is " + k);
//		

//      HttpSession session = req.getSession();
//      session.setAttribute("k",k);

//        req.setAttribute("k", k);
//        req.setAttribute("i", i);
//        req.setAttribute("j", j);
//        
//        RequestDispatcher rd = req.getRequestDispatcher("Square");
//        rd.forward(req,res);

	}
}
