package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.KhachHang;

public class KhachHangForm extends ActionForm{
	private String maKH;
	private String tenKH;
	private String diaChi;
	private String sdt;
	private String email;
	private String submit;
	
	private List<KhachHang> listKH;

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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public List<KhachHang> getListKH() {
		return listKH;
	}

	public void setListKH(List<KhachHang> listKH) {
		this.listKH = listKH;
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
