package com.minuli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MulServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num1"));
		
		int result = n1*n2;
		PrintWriter pw= res.getWriter();
		pw.println("Result is "+result);
		
	}

}
