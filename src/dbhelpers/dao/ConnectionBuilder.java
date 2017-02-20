package dbhelpers.dao;

import static dbhelpers.Constants.dbName;
import static dbhelpers.Constants.pwd;
import static dbhelpers.Constants.uname;
import static dbhelpers.Constants.url;
import static dbhelpers.Constants.serverCert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

	private static Connection connection = null;

	public ConnectionBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static Connection connect() {
		String connectString = url + dbName + serverCert;
		// System.out.println("getting a new connection");
		if (connection == null) {
			// setting up driver

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				connection = DriverManager.getConnection(connectString, uname, pwd);
				System.out.println(connection);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}

	public static void disconnect() {
		try {
			if (connection != null) {
				connection.close();
				connection = null;
				System.out.println("Disconnected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
