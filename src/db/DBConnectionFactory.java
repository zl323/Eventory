package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {

	private static final String DEFAULT_DB = "mysql";

	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			return new MySQLConnection(); // return new MySQLConnection();
		case "mongodb":
			return null; // return new MongoDBConnection();
		default:
			throw new IllegalArgumentException("Invalid db" + db);
		}
	}

	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}

}