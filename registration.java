package jspRegistration1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/registerform")
public class registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		String repass = req.getParameter("repass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cs= DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
			String query = "insert into loginnn(name , username, pass, repass) values(?,?,?,?)";
			PreparedStatement ps = cs.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, pass);
			ps.setString(4, repass);
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
