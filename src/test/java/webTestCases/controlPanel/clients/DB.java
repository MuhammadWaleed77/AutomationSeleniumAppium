package webTestCases.controlPanel.clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {

		// TODO Auto-generated method stub
		//
		String host = "numuworld-api-staging-database.cip1bixrtalr.eu-west-1.rds.amazonaws.com";
		String port = "3306";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/stage-v3", "numuTestDB", "poisonContlearnDB21?");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select secret_key from partnerships where title like  '%FWTest%'");
		while(rs.next()) {
			String secretKey = rs.getString(1);
			System.out.println(secretKey);
		}
			
	}
}
