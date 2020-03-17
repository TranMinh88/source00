package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.Login;

public class LoginDAO {
	Connection connection = null;
	ResultSet resultSet = null;
	PreparedStatement pstm = null;
	List<Login> list;
	public List<Login> getLogin() {
		try {
			list = new ArrayList<Login>();
			connection = ConnectDB.getConnect();
			
			String sql = "select * from LOGIN";
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();
			while (resultSet.next()) {
				list.add(new Login(resultSet.getString("username"), resultSet.getString("password")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	return list;
	}
}
