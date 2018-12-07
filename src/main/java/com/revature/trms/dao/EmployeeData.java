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
	public User validateUser(String username, String password) {
		Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
		
		User user = null;
		try {
			String sql = "select employeeId, firstname, lastname, username, e.\"availableTuition\",  d.name from employee e "
					+ "left join departments d on e.departmentid = d.departmentid "
					+ "where username = '" + username + "' and  \"password\" = crypt('" + password +"' , \"password\");";
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setFirstname(rs.getString(2));
				user.setLastname(rs.getString(3));
				user.setUsername(rs.getString(4));
				user.setAvailableTuition(rs.getDouble(5));
				user.setDepartment(rs.getString(6));
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
