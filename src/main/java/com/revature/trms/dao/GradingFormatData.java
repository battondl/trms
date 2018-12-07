package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.trms.domain.User;
import com.revature.trms.utils.ConnectionFactory;

public class GradingFormatData implements GradingFormatDAO{

	@Override
	public int getGradingFormatId(String gradingFormat) {
		Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
		
		int id = 0;
		try {
			String sql = "select \"gradingFormatId\" from grading_format where name = '" + gradingFormat + "';";

			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				id = rs.getInt(1);
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
		
		
		return id;
	}

}
