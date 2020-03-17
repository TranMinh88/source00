package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.bean.SuDungMay_DichVuBean;

public class SuDungMay_DichVuDAO {
	Connection connection = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int kq;
	List<SuDungMay_DichVuBean> list;
	
	public List<SuDungMay_DichVuBean> getDs() {
		list = new ArrayList<SuDungMay_DichVuBean>();
		try {
			connection = ConnectDB.getConnect(); // gọi tới hàm kết nối db
			String sql = "SELECT * FROM View_KH_SD_MayVaDichVu";
			pstm = connection.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				list.add(new SuDungMay_DichVuBean(rs.getString("MaKH"), rs.getString("TenKH"),
						rs.getString("MaMay"), rs.getString("ViTri"), rs.getString("TrangThai"),
						rs.getString("NgayBatDauSD"), rs.getString("GioBatDauSD"), rs.getInt("ThoiGianSD"),
						rs.getString("MaDV"), rs.getString("NgaySD"), rs.getString("GioSD"), rs.getInt("SoLuong"), rs.getInt("TongTien")));
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
	
	public static void main(String[] args) {
		SuDungMay_DichVuDAO suDungMay_DichVuDAO = new SuDungMay_DichVuDAO();
		List<SuDungMay_DichVuBean> list = suDungMay_DichVuDAO.getDs();
		
		for (SuDungMay_DichVuBean suDungMay_DichVuBean : list) {
			// se in ra nam hien tai - cho nam trong 'ngayBDSD'
			System.out.println(LocalDate.now().getYear() - (Integer.parseInt(suDungMay_DichVuBean.getNgayBatDauSD().split("/")[2])));
		}
	}
}
