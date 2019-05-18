package org.jsp.apps;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/otpclass")
public class Generate_Otp extends GenericServlet
{

	String mobile_number;
	String url="jdbc:mysql://localhost:3306?user=root&password=scan2cad2";
	String query="select name from test.registration where mobilenumber=? ";
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException
	{
		 mobile_number=request.getParameter("mobile");
		 
		verifymobile(response);
		 
	}	
	 public void verifymobile(ServletResponse response)
	 {
		 try 
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url);
			System.out.println("connection is created");

			PreparedStatement pstmp=conn.prepareStatement(query);
			System.out.println("platform is created");
			
			pstmp.setString(1, mobile_number);
			
			ResultSet rs=pstmp.executeQuery();
			
			PrintWriter pw=response.getWriter();
			
			if(rs.next())
			{
				Random rd=new Random();
				 int otp=rd.nextInt(10000);
				  pw.println(" Mobile Number is verified and OTP is "+otp);
			}
			else
			{
				pw.println("Invalid Mobile Number");
			}
			
			
		}
		 catch (SQLException | ClassNotFoundException | IOException e)
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
	 
	
}
