package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.DichVu;


public class DichVuDAO {
	Connection connection;
	PreparedStatement pstm;
	ResultSet rs;
	int kq;
	List<DichVu> listDV;
	
	// them Dich vu
	public int themDV(String maDV, String tenDV, String donViTinh, long donGia) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES (?,?,?,?)";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maDV);
			pstm.setString(2, tenDV);
			pstm.setString(3, donViTinh);
			pstm.setLong(4, donGia);
			
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
	
	// sua dich vu
	public int suaDV(String maDV, String tenDV, String donViTinh, long donGia) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "UPDATE DICHVU SET TenDV =?, DonViTinh =?, DonGia =? where MaDV = ?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, tenDV);
			pstm.setString(2, donViTinh);
			pstm.setLong(3, donGia);
			pstm.setString(4, maDV);
			
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
	
	// get dich vu
	public List<DichVu> getDV() {
		listDV = new ArrayList<DichVu>();
		try {
			connection = ConnectDB.getConnect(); // gọi tới hàm kết nối db
			String sql = "SELECT * FROM DICHVU";
			pstm = connection.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				//listDV.add(new DichVu(rs.getString("MaDV"), rs.getString("TenDV") + " - " + rs.getString("MaDV"), rs.getString("DonViTinh"), rs.getLong("DonGia")));
				listDV.add(new DichVu(rs.getString("MaDV"), rs.getString("TenDV"), rs.getString("DonViTinh"), rs.getLong("DonGia")));
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

		return listDV;
	}
	
	// get dich vu by maDV
	public DichVu getDVByMaDV(String maDV) {
		DichVu dichVu = null;
		try {
			connection = ConnectDB.getConnect(); // gọi tới hàm kết nối db
			String sql = "SELECT * FROM DICHVU where MaDV = ?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maDV);
			rs = pstm.executeQuery();

			while (rs.next()) {
				dichVu = new DichVu(rs.getString("MaDV"), rs.getString("TenDV"), rs.getString("DonViTinh"), rs.getLong("DonGia"));
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

		return dichVu;
	}
	
	// xoa tung DV
	public int xoaDV(String maDV) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "delete from DICHVU where MaDV = ?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maDV);
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
