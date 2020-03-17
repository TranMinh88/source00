package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.KhachHang;
import model.bean.May;

public class DangKySuDungMayForm extends ActionForm{
	private String maKH;
	private String maMay;
	private String ngayBDSD;
	private String gioBDSD;
	private int thoiGianSD;
	private String submit;
	
	List<May> listMay;
	List<KhachHang> listKH;
	
	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getNgayBDSD() {
		return ngayBDSD;
	}

	public void setNgayBDSD(String ngayBDSD) {
		this.ngayBDSD = ngayBDSD;
	}

	public String getGioBDSD() {
		return gioBDSD;
	}

	public void setGioBDSD(String gioBDSD) {
		this.gioBDSD = gioBDSD;
	}

	public int getThoiGianSD() {
		return thoiGianSD;
	}

	public void setThoiGianSD(int thoiGianSD) {
		this.thoiGianSD = thoiGianSD;
	}

	public List<May> getListMay() {
		return listMay;
	}

	public void setListMay(List<May> listMay) {
		this.listMay = listMay;
	}

	public List<KhachHang> getListKH() {
		return listKH;
	}

	public void setListKH(List<KhachHang> listKH) {
		this.listKH = listKH;
	}
	
	public String getSubmit() {
		return submit;
	}
	
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	
	public String getMaMay() {
		return maMay;
	}
	
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
