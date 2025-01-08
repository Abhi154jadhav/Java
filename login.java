package jspRegistration1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/Loginform")
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cs= DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
			String query = "select * from loginnn where username = ? and pass = ?";
			PreparedStatement ps = cs.prepareStatement(query);
			ps.setString(2, username);
			ps.setString(3, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				PrintWriter out = res.getWriter();
				out.print("<h1> loginn successfully </h1>");
				
			}
			else {
				PrintWriter out = res.getWriter();
				out.print("<h1> password and username dosent match </h1>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
