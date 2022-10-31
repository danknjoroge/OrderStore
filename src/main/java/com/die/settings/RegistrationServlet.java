package com.die.settings;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ufname= request.getParameter("fname");
		String ulname= request.getParameter("lname");
		String uemail= request.getParameter("email");
		String upass= request.getParameter("pass");
		String repass= request.getParameter("re_pass");
		int ucontact= Integer.parseInt(request.getParameter("contact"));
		
		RequestDispatcher dispatcher = null;
		PrintWriter out = response.getWriter();
//		out.println("fname" + ufname);
//		out.println("lname" +ulname);
//		out.println("email" +uemail);
//		out.println("pass" + upass);
//		out.println("contact" + ucontact);
		Connection con=null;
		
		
		try {
			String url = "jdbc:mysql://localhost:3306/customers?useSSL=false";
			String username ="kahora";
			String password ="password";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			
			out.print("Connection Established");
			
			PreparedStatement pst = con.prepareStatement("insert into users(firstname,lastname,email,password,contact) values(?,?,?,?,?)");
			
			pst.setString(1, ufname);
			pst.setString(2, ulname);
			pst.setString(3, uemail);
			pst.setString(4, upass);
			pst.setInt(5, ucontact);
			
			int rowCount = pst.executeUpdate();
			
			if(rowCount >0) {
				request.setAttribute("status", "success");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}else {
				request.setAttribute("status", "failed");

			}
			dispatcher.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}


