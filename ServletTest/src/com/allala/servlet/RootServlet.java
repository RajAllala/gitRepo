package com.allala.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RootServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2837859525853713695L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		out.println("This is my first Root Servlet");
	}

}
