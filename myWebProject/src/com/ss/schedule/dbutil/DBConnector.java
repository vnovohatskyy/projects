package com.ss.schedule.dbutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnector {
//	private static final String DBURL = "jdbc:postgresql://127.0.0.1:5432/institute";
//	private static final String USER = "postgres";
//	private static final String PASSWORD = "root";

	private static Connection connection = null;

//	public static Connection getConnection() {
//		if (connection != null)
//			return connection;
//		else {
//			try {
//				Class.forName("org.postgresql.Driver");
//				connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			return connection;
//		}
//
//	}
	
	public static Connection getConnection() {
		if (connection != null)
			return connection;
        InputStream inputStream = DBConnector.class.getClassLoader().getResourceAsStream( "/db.properties" );
        Properties properties = new Properties();
        try {
            properties.load( inputStream );
            String driver = properties.getProperty( "driver" );
            String url = properties.getProperty( "url" );
            String user = properties.getProperty( "user" );
            String password = properties.getProperty( "password" );
            Class.forName( driver );
            connection = DriverManager.getConnection( url, user, password );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return connection;
    }
}
