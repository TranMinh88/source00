package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachMayForm;
import model.bean.May;
import model.bo.MayBO;

public class DanhSachMayAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		DanhSachMayForm danhSachMayForm = (DanhSachMayForm) form;
		
		// lay ds may
		MayBO mayBO = new MayBO();
		List<May> mays = mayBO.getMay();
		danhSachMayForm.setListMay(mays);
		
		return mapping.findForward("dsMay");
	}
}
