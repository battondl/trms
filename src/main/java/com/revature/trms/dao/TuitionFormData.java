package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.revature.trms.domain.TuitionForm;
import com.revature.trms.utils.ConnectionFactory;

public class TuitionFormData implements TuitionFormDAO{

	@Override
	public void submitRequest(TuitionForm form) {
		Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
		GradingFormatData gradingFormat = new GradingFormatData();
		EventTypeData eventType = new EventTypeData();

		try {
			String sql = "insert into tuition_request (employeeid, cost, description, \"eventTypeId\", "
					+ "\"gradingFormatId\", \"workJustification\", \"requestDate\", \"trainingDate\", "
					+ "\"statusId\") values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setInt(1, form.getUser().getUserId());
			preparedStmt.setDouble(2, form.getCost());
			preparedStmt.setString(3, form.getDescription());
			preparedStmt.setInt(4, eventType.getEventIdByName(form.getEventType()));
			preparedStmt.setInt(5, gradingFormat.getGradingFormatId(form.getGradingFormat()));
			preparedStmt.setString(6, form.getWorkJustification());
			preparedStmt.setDate(7, java.sql.Date.valueOf(form.getRequestDate()));
			preparedStmt.setDate(8, java.sql.Date.valueOf(form.getTrainingDate()));
			preparedStmt.setInt(9, 1);
			
			preparedStmt.executeUpdate();

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
	}

}
