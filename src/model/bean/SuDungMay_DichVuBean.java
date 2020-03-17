package model.bean;

public class SuDungMay_DichVuBean {
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
	
	public SuDungMay_DichVuBean() {
	}
	
	public SuDungMay_DichVuBean(String maKH, String tenKH, String maMay, String viTri, String trangThai,
			String ngayBatDauSD, String gioBatDauSD, int thoiGianSD, String maDV, String ngaySD, String gioSD,
			int soLuong, int tongTien) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
		this.ngayBatDauSD = ngayBatDauSD;
		this.gioBatDauSD = gioBatDauSD;
		this.thoiGianSD = thoiGianSD;
		this.maDV = maDV;
		this.ngaySD = ngaySD;
		this.gioSD = gioSD;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
	}
	
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

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
}
