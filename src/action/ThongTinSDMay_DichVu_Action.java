package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import form.ThongTinSDMay_DichVu_Form;
import model.bean.SuDungMay_DichVuBean;
import model.bo.KhachHangBO;

public class ThongTinSDMay_DichVu_Action extends DispatchAction{
	KhachHangBO khachHangBO = new KhachHangBO();
	
	public ActionForward dsDichVu(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ThongTinSDMay_DichVu_Form sdMay_DichVu_Form = (ThongTinSDMay_DichVu_Form) form;
		List<SuDungMay_DichVuBean> list = khachHangBO.getDs();
		sdMay_DichVu_Form.setList(list);
		
		return mapping.findForward("dsDV");
	}
}
