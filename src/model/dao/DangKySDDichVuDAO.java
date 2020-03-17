package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DangKySDDichVuDAO {
	Connection connection;
	PreparedStatement pstm;
	ResultSet rs;
	int kq;
	
	// dang ky su dung dv
	public int dangKySDDV(String maKH, String maDV, String ngaySD, String gioSD, int soLuong) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "INSERT INTO SUDUNGDV (MaKH, MaDV, NgaySD, GioSD, SoLuong) VALUES (?,?,?,?,?)";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maKH);
			pstm.setString(2, maDV);
			pstm.setString(3, ngaySD);
			pstm.setString(4, gioSD);
			pstm.setInt(5, soLuong);
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
