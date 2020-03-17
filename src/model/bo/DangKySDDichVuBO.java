package model.bo;

import model.dao.DangKySDDichVuDAO;

public class DangKySDDichVuBO {
	DangKySDDichVuDAO sdDichVuDAO = new DangKySDDichVuDAO();
	public int dangKySDDV(String maKH, String maDV, String ngaySD, String gioSD, int soLuong) {
		return sdDichVuDAO.dangKySDDV(maKH, maDV, ngaySD, gioSD, soLuong);
	}
}
