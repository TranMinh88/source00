package model.bo;

import java.util.List;

import model.bean.DichVu;
import model.dao.DichVuDAO;

public class DichVuBO {
	DichVuDAO dichVuDAO = new DichVuDAO();
	
	// Them DV
	public int themDV(String maDV, String tenDV, String donViTinh, long donGia) {
		return dichVuDAO.themDV(maDV, tenDV, donViTinh, donGia);
	}
	
	// sua dich vu
	public int suaDV(String maDV, String tenDV, String donViTinh, long donGia) {
		return dichVuDAO.suaDV(maDV, tenDV, donViTinh, donGia);
	}
	
	// get DV
	public List<DichVu> getDV() {
		return dichVuDAO.getDV();
	}
	
	// get dich vu by maDV
	public DichVu getDVByMaDV(String maDV) {
		return dichVuDAO.getDVByMaDV(maDV);
	}
	
	// xoa tung DV
	public int xoaDV(String maDV) {
		return dichVuDAO.xoaDV(maDV);
	}
}
