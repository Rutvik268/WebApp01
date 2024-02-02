package com.rutvik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Square")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int k = 0;

		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}

		k = k * k;

		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='red'>");
		out.println("value is " + k);
		out.println("</body></html>");

//		out.println("value of "+ i +" + "+j+" square is "+k);

//		int k = Integer.parseInt(req.getParameter("k"));
//		int i = Integer.parseInt(req.getParameter("i"));
//		int j = Integer.parseInt(req.getParameter("j"));

//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		System.out.println("Square called");
	}
}
