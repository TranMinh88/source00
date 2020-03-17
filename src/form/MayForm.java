package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.May;

public class MayForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2680586368117031132L;
	private String maMay;
	private String viTri;
	private String trangThai;
	private String submit;
	private May may;
	private List<May> listMay;
	
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

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}
	
	public List<May> getListMay() {
		return listMay;
	}
	
	public void setListMay(List<May> listMay) {
		this.listMay = listMay;
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
