package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.May;

public class MayDAO {
	Connection connection = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int kq;
	List<May> listMay;
	
	// them may
	public int themMay(String maMay, String viTri, String trangThai) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "INSERT INTO MAY (MaMay, ViTri, TrangThai) VALUES (?, ?, ?)";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maMay);
			pstm.setString(2, viTri);
			pstm.setString(3, trangThai);
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
	
	// xoa tung may
	public int xoaMay(String maMay) {
		try {
			connection = ConnectDB.getConnect();
			/*//String sql = "delete from MAY where MaMay = ?";
			//pstm = connection.prepareStatement(sql);
			//pstm.setString(1, maMay);
			CallableStatement callableStatement = connection.prepareCall("exec xoa_May ?");
			callableStatement.setString(1, maMay);
			//kq = pstm.executeUpdate();
			if (callableStatement.executeBatch() != null) {
				kq = 1;
			}*/
			
			//1 Connection conn;
			//2 conn = DriverManager.getConnection(“jdbc:sqlserver://localhost;user=sa;password=sa;database=java;“);
			//3 // khoi tao transaction
			connection.setAutoCommit(false); // 4
			Statement command = connection.createStatement(); // 5
			
			command.addBatch("exec xoa_May " + maMay); // 6
			/*7 command.addBatch(“insert into subject(id,sem_id,name) values(1,1,’HTML’)“);
			8 command.addBatch(“insert into subject(id,sem_id,name) values(2,1,’Java’)“);
			9 command.addBatch(“insert into subject(id,sem_id,name) values(2,1,’csharpe’)“);*/
			command.executeBatch(); // 10
			//11 // cap nhat thay doi du lieu ve server
			kq = 1;
			connection.setAutoCommit(true); // 12
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
	
	// sua may
	public int suaMay(String maMay, String viTri, String trangThai) {
		try {
			connection = ConnectDB.getConnect();
			String sql = "UPDATE MAY SET ViTri = ?, TrangThai = ? where MaMay = ?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, viTri);
			pstm.setString(2, trangThai);
			pstm.setString(3, maMay);
			
			kq = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return kq;
	}
	
	// get may
	public List<May> getMay() {
		listMay = new ArrayList<May>();
		try {
			connection = ConnectDB.getConnect(); // gọi tới hàm kết nối db
			String sql = "SELECT * FROM MAY";
			pstm = connection.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				listMay.add(new May(rs.getString("MaMay"), rs.getString("ViTri"), rs.getString("TrangThai")));
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

		return listMay;
	}
	
	// get may theo mã
	public List<May> getMayByID(String maMay) {
		listMay = new ArrayList<May>();
		try {
			connection = ConnectDB.getConnect(); // gọi tới hàm kết nối db
			String sql = "SELECT * FROM MAY where MaMay = ?";
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, maMay);
			rs = pstm.executeQuery();

			while (rs.next()) {
				listMay.add(new May(rs.getString("MaMay"), rs.getString("ViTri"), rs.getString("TrangThai")));
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

		return listMay;
	}
}
