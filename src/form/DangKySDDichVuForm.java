package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.DichVu;
import model.bean.KhachHang;

public class DangKySDDichVuForm extends ActionForm {
	private String maKH;
	private String maDV;
	private String tenDV;
	private String ngaySD;
	private String gioSD;
	private int soLuong;
	private String submit;

	List<DichVu> listDV;
	List<KhachHang> listKH;

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getMaDV() {
		return maDV;
	}

	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}

	public String getNgaySD() {
		return ngaySD;
	}

	public void setNgaySD(String ngaySD) {
		this.ngaySD = ngaySD;
	}

	public String getGioSD() {
		return gioSD;
	}

	public void setGioSD(String gioSD) {
		this.gioSD = gioSD;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public List<DichVu> getListDV() {
		return listDV;
	}

	public void setListDV(List<DichVu> listDV) {
		this.listDV = listDV;
	}

	public List<KhachHang> getListKH() {
		return listKH;
	}

	public void setListKH(List<KhachHang> listKH) {
		this.listKH = listKH;
	}
	
	public String getTenDV() {
		return tenDV;
	}
	
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
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
