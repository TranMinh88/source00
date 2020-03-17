package form;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.May;

public class DanhSachMayForm extends ActionForm{
	List<May> listMay;

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
