package model.bo;

import java.util.List;

import model.bean.KhachHang;
import model.bean.SuDungMay_DichVuBean;
import model.dao.KhachHangDAO;
import model.dao.SuDungMay_DichVuDAO;

public class KhachHangBO {
	KhachHangDAO khachHangDAO = new KhachHangDAO();
	SuDungMay_DichVuDAO suDungMay_DichVuDAO = new SuDungMay_DichVuDAO();
	public List<KhachHang> getKhachHang() {
		return khachHangDAO.getKhachHang();
	}
	
	// them KH
	public int themKH(String maKH, String tenKH, String diaChi, String sdt, String email) {
		return khachHangDAO.themKH(maKH, tenKH, diaChi, sdt, email);
	}
	
	// xoa KH
	public int xoaKH(String maKH) {
		return khachHangDAO.xoaKH(maKH);
	}
	
	// ds thong tin sd may va dv-----------------------------------------------------------------
	public List<SuDungMay_DichVuBean> getDs() {
		return suDungMay_DichVuDAO.getDs();
	}
}
