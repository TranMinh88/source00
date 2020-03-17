package model.bo;

import model.dao.DangKySDMayDAO;

public class DangKySDMayBO {
	DangKySDMayDAO sdMayDAO = new DangKySDMayDAO();
	
	// dang ky su dung may
	public int dangKySDMay(String maKH, String maMay, String ngayBatDauSD, String gioBatDauSD, int thoiGianSD) {
		return sdMayDAO.dangKySDMay(maKH, maMay, ngayBatDauSD, gioBatDauSD, thoiGianSD);
	}
}
