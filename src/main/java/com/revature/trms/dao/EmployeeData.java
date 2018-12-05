package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.trms.domain.User;
import com.revature.trms.utils.ConnectionFactory;

public class EmployeeData implements EmployeeDao {

	@Override
	public User isValidUsernameAndPassword(String username, String password) {
		Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
		
		User user = null;
		try {
			String sql = "select firstname, lastname, username from employee where username = '" + username + "' and  \"password\" = crypt('" + password +"' , \"password\");";
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				user = new User();
				user.setFirstname(rs.getString(1));
				user.setLastname(rs.getString(2));
				user.setUsername(rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return user;
	}

}
