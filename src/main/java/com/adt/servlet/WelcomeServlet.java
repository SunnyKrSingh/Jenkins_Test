package com.adt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//simple settings
		PrintWriter pw=null;
		pw=res.getWriter();
		//setting contenet type
		res.setContentType("text/html");
	
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("<h2 style='color:green'>Welcome to servlet<h2>");  
		pw.println("</body></html>");  
		
		//closing the stream  
		pw.close(); 
		
	}

}
