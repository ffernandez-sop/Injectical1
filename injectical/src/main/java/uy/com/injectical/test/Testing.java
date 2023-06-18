package uy.com.injectical.test;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import uy.com.injectical.dao.DbConnection;
import uy.com.injectical.dao.EventoDao;

public class Testing {

	public static void main(String [] args) throws SQLException  {
		
		DbConnection conn;
		try {
			EventoDao evDao = new EventoDao(DbConnection.getInstance());
			evDao.getEvento().forEach((evento) -> System.out.println(evento));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
