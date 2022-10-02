package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Ex07ChangeBg")
public class Ex07ChangeBg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		
		// 요청한 데이터를 확인해야하닌까 request
		String color = request.getParameter("color");
		System.out.println(color);

		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor = '" + color + "'>");
		
		
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
