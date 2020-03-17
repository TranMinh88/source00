package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.KhachHang;


public class KhachHangDAO {
	Connection connection;
	Statement statement;
	PreparedStatement pstm;
	ResultSet rs;
	KhachHang khachHang;
	List<KhachHang> listKH;
	int kq;

	public List<KhachHang> getKhachHang() {
		listKH = new ArrayList<KhachHang>();
		try {
			connection = ConnectDB.getConnect(); // gọi tới hàm kết nối db
			String sql = "SELECT * FROM KHACHHANG";
			pstm = connection.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				listKH.add(new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("DiaChi"),
						rs.getString("SoDienThoai"), rs.getString("Email")));
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

		return listKH;
	}
	
	// them Khach hang
	public int themKH(String maKH, String tenKH, String diaChi, String sdt, String email) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDienThoai, Email) VALUES (?,?,?,?,?)";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maKH);
			pstm.setString(2, tenKH);
			pstm.setString(3, diaChi);
			pstm.setString(4, sdt);
			pstm.setString(5, email);
			
			kq = pstm.executeUpdate();
			
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
		
		return kq;
	}
	
	// xoa tung KH
	public int xoaKH(String maKH) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "delete from KHACHHANG where MaKH = ?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maKH);
			kq = pstm.executeUpdate();
			
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
		
		return kq;
	}
}
