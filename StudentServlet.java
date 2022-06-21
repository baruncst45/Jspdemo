package com.acn.lkm;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Accept both id and name with the help of HttpServletRequest reference 
		String id=req.getParameter("empId");
		String name=req.getParameter("stdName");
		Object Age=req.getParameter("stdAge");
		String Dept=req.getParameter("dept");
		// Output will be write in browser page
		PrintWriter out=resp.getWriter();
		out.print("<h1>");
		out.print("Welcome in Student Login page: ");
		out.print("</h1>");
		out.print("<br/>");// Break the line
		out.print("Employee Id and Name is: "+id+" "+name+" "+Age+" "+Dept);
		
	}
}
