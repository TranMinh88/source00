package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.MayForm;
import model.bo.MayBO;

public class ThemMayAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		MayForm mayForm = (MayForm) form;
		
		// nhan nut xac nhan them o trang them may
		if ("Thêm mới máy".equals(mayForm.getSubmit())) {
			String maMay = mayForm.getMaMay();
			String viTri = mayForm.getViTri();
			String trangThai = mayForm.getTrangThai();
			
			MayBO mayBO = new MayBO();
			mayBO.themMay(maMay, viTri, trangThai);
			
			return mapping.findForward("themMayOK");
		} else { // chuyen sang trang them may
			return mapping.findForward("themMay");
		}		
	}
}
