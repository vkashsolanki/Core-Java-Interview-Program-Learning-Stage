package database;

import java.sql.Connection;
import java.sql.DriverManager;

import utils.PropertyReader;

public final class ConnectionProvider {

	static Connection connection = null;

	private ConnectionProvider() {

	}

	synchronized static public Connection getMyConnection() {
		
		if(connection == null) {
			
			try {
				Class.forName(PropertyReader.readProperty("DB_DRIVER"));
				
				
				connection = DriverManager.getConnection(PropertyReader.readProperty("DB_URL")
						,PropertyReader.readProperty("DB_USER")
						,PropertyReader.readProperty("DB_PASS"));
				
				System.out.println("Connection Print for ConnectionProvider ==>>>"+connection);
				
				return connection;
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		else {
			
			return connection;
		}
		
		return connection;
			
	}

}
