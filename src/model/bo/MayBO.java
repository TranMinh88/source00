package model.bo;

import java.util.List;

import model.bean.May;
import model.dao.MayDAO;

public class MayBO {
	MayDAO mayDAO = new MayDAO();
	
	// them may
	public int themMay(String maMay, String viTri, String trangThai) {
		return mayDAO.themMay(maMay, viTri, trangThai);
	}
	
	// xoa may theo maMay
	public int xoaMay(String maMay) {
		return mayDAO.xoaMay(maMay);
	}
	
	// sua may
	public int suaMay(String maMay, String viTri, String trangThai) {
		return mayDAO.suaMay(maMay, viTri, trangThai);
	}
	
	// get may
	public List<May> getMay() {
		return mayDAO.getMay();
	}
	
	// get may thao mã
	public List<May> getMayByID(String maMay) {
		return mayDAO.getMayByID(maMay);
	}
}
