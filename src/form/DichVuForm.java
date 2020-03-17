package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.DichVu;

public class DichVuForm extends ActionForm{
	private String maDV;
	private String tenDV;
	private String donViTinh;
	private long donGia;
	private String submit;
	
	private String loiTrungMa;
	
	private List<DichVu> listDV;
	
	public String getMaDV() {
		return maDV;
	}

	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}

	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
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

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getLoiTrungMa() {
		return loiTrungMa;
	}

	public void setLoiTrungMa(String loiTrungMa) {
		this.loiTrungMa = loiTrungMa;
	}
}
