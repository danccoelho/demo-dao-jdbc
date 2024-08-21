package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;	

		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ? ");
			
			st.setInt(1, 3);
					
				
			
			int rowAffected = st.executeUpdate();	
			
			System.out.println("Done! rows affected: " + rowAffected);
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
