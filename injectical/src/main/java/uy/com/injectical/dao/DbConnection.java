package uy.com.injectical.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import uy.com.ijectical.config.ReadPropertyFile;

public class  DbConnection {

	private String bd;
	private String login;
	private String password;
	private String url;
	private Connection conn = null;

	private static DbConnection dbConnInsance;

	private DbConnection() {}

	public static DbConnection getInstance() throws IOException {
		if (dbConnInsance == null)dbConnInsance = new DbConnection();
		return dbConnInsance;
	}
	
	public void setPropertiesConnection() throws IOException{
		this.bd			=ReadPropertyFile.getInstance().getProperty("DB");
		this.login		=ReadPropertyFile.getInstance().getProperty("login");
		this.password	=ReadPropertyFile.getInstance().getProperty("pass");
		this.url		=ReadPropertyFile.getInstance().getProperty("DBurl");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(url + bd , login, password);
				
				if (conn != null) {
		            System.out.println("Connecting database [" + conn + "] OK");
		         }
			} catch (SQLException e) {
		
				System.out.println("Excepcion conexion: " + e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			
			 System.out.println("Excepcion no encuentra la clase: " + e.getStackTrace()); 
		}
	}	
	
	public void disconnect() {

		if (conn != null) {
			try {
				conn.close();
				System.out.println("Closing database: [" + conn + "] OK");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

	public String getBd() {
		return bd;
	}

	public String getLogin() {
		return login;
	}

	public String getUrl() {
		return url;
	}

	public Connection getConn() {
		return conn;
	}


	
	
	
}
