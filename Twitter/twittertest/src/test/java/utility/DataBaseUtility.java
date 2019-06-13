package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtility {
	
	Statement stmt;
	Connection conection;
	
	public Statement getConnectionStatement() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			stmt = conection.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	return stmt;
	}
	
	public ResultSet executeQuery(String sqlQuery) throws SQLException {
		ResultSet result = stmt.executeQuery(sqlQuery);
		return result;
	}

	public void connectionTearDown() throws SQLException {
		conection.close();
	}
	
}
