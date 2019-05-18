package org.jsp.apps;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/currency")
public class Currency_converter extends GenericServlet
{
	

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		String dollar =req.getParameter("currency");
		int money_dollar=Integer.parseInt(dollar);
		
		
		int money_rupee=70*(money_dollar);
		
		PrintWriter pw=resp.getWriter();
		pw.println("Money in rupees is "+money_rupee);
		
		
	}

}
