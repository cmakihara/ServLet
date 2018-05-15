package com.javaee.projeto1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Primeira servlet</title>");					
			out.println("</head>");
			
			out.println("<body>");
				out.println("<h1> Hello </h2>");
			out.println("</body>");
			
		out.println("</html>");
		
		out.close();
	}

		

}
