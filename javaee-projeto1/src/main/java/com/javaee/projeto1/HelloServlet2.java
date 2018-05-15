package com.javaee.projeto1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="HelloServlet2",urlPatterns= {"/hello2"})
public class HelloServlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Primeira servlet</title>");					
			out.println("</head>");
			
			out.println("<body>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
				out.println("<input type=\"text\" name=\"input1\" value=\"Mickey\"><br>");
			out.println("</body>");
			
		out.println("</html>");
		
		out.close();
	}

		

}
