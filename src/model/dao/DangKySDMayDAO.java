package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DangKySDMayDAO {
	Connection connection;
	PreparedStatement pstm;
	ResultSet rs;
	int kq;
	
	// dang ky su dung may
	public int dangKySDMay(String maKH, String maMay, String ngayBatDauSD, String gioBatDauSD, int thoiGianSD) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "INSERT INTO SUDUNGMAY (MaKH, MaMay, NgayBatDauSD, GioBatDauSD, ThoiGianSD) VALUES (?,?,?,?,?)";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maKH);
			pstm.setString(2, maMay);
			pstm.setString(3, ngayBatDauSD);
			pstm.setString(4, gioBatDauSD);
			pstm.setInt(5, thoiGianSD);
			kq = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return kq;
	}
}
