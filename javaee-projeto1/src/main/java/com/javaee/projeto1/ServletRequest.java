package com.javaee.projeto1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ServletRequest", urlPatterns= {"/servlet_req"})
public class ServletRequest extends HttpServlet{

//	protected void service(HttpServletRequest req, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		PrintWriter out = response.getWriter();
//		
//		String login = req.getParameter("login");
//		String password = req.getParameter("password");
//		
//		out.println("<html>");
//			out.println("<head>");
//				out.println("<title>Primeira servlet</title>");					
//			out.println("</head>");
//			
//			out.println("<body>");
//				out.println("<h1> Hello </h2>");
//				
//				out.println("<p>login"+ login+" </p>");				
//				out.println("<p> senha"+ password +" </p>");
//			out.println("</body>");
//			
//		out.println("</html>");
//		
//		out.close();
//	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		out.println("<html>");
			out.println("<head>");
				out.println("<title>ServletRequest</title>");					
			out.println("</head>");
			
			out.println("<body>");
				out.println("<h1> Hello </h2>");
				out.println("<h1> doPost </h2>");
				out.println("<p>login"+ login+" </p>");				
				out.println("<p> senha"+ password +" </p>");
			out.println("</body>");
			
		out.println("</html>");
		
		out.close();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Primeira servlet</title>");					
			out.println("</head>");
			
			out.println("<body>");
				out.println("<h1> Hello </h2>");
				out.println("<h1> doGet </h2>");
				out.println("<p>login"+ login+" </p>");				
				out.println("<p> senha"+ password +" </p>");
			out.println("</body>");
			
		out.println("</html>");
		
		out.close();
	}

}
