package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.SuDungMay_DichVuBean;

public class ThongTinSDMay_DichVu_Form extends ActionForm {
	private String maKH;
	private String tenKH;
	private String maMay;
	private String viTri;
	private String trangThai;
	private String ngayBatDauSD;
	private String gioBatDauSD;
	private int thoiGianSD;
	private String maDV;
	private String ngaySD;
	private String gioSD;
	private int soLuong;
	private int tongTien;

	private List<SuDungMay_DichVuBean> list;

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getNgayBatDauSD() {
		return ngayBatDauSD;
	}

	public void setNgayBatDauSD(String ngayBatDauSD) {
		this.ngayBatDauSD = ngayBatDauSD;
	}

	public String getGioBatDauSD() {
		return gioBatDauSD;
	}

	public void setGioBatDauSD(String gioBatDauSD) {
		this.gioBatDauSD = gioBatDauSD;
	}

	public int getThoiGianSD() {
		return thoiGianSD;
	}

	public void setThoiGianSD(int thoiGianSD) {
		this.thoiGianSD = thoiGianSD;
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

	public List<SuDungMay_DichVuBean> getList() {
		return list;
	}

	public void setList(List<SuDungMay_DichVuBean> list) {
		this.list = list;
	}
	
	public int getTongTien() {
		return tongTien;
	}
	
	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
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
