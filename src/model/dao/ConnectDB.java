/*
* (C) _Mình Là Minh_
* 
*@author HCD-Fresher128
*@date Jul 22, 2019
*@version 1.0
*/
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	static Connection sqlConnect;
	
	public static Connection getConnect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			sqlConnect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QUANLYMAY; username=sa; password=123");
		} catch (ClassNotFoundException e) {
			System.out.println("Chua nap driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Chua ket noi!");
			e.printStackTrace();
		}
		
		return sqlConnect;
	}
}