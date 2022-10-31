package com.die.settings;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uemail = request.getParameter("email");
		 String upass = request.getParameter("password");
		 Connection con=null;
		 HttpSession session = request.getSession();
		 RequestDispatcher dispatcher = null;
		 
		 try {
			 String url = "jdbc:mysql://localhost:3306/customers";
			 String username ="kahora";
				String password ="password";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,username,password);
				
				
				
				PreparedStatement pst = con.prepareStatement("select * from users where email = ? and password = ? ");
				pst.setString(1, uemail);
				pst.setString(2, upass);
			 
				ResultSet rs = pst.executeQuery();
				
				
				if(rs.next()) {
					session.setAttribute("name", rs.getString("firstname"));
					dispatcher = request.getRequestDispatcher("welcome.jsp");
				}else {
					request.setAttribute("status", "failed");
					dispatcher = request.getRequestDispatcher("login.jsp");
				}
				dispatcher.forward(request, response);
				
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	}

}
