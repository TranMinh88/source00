package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.MayForm;
import model.bean.May;
import model.bo.MayBO;

public class XoaMayAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		MayForm mayForm = (MayForm) form;
		MayBO mayBO = new MayBO();
		List<May> mays;
		
		String maMay = mayForm.getMaMay();		
		if ("Xác nhận xóa".equals(mayForm.getSubmit())) {			
			mayBO.xoaMay(maMay);
			
			return mapping.findForward("xoaMayOK");
		} else {
			mays = mayBO.getMayByID(maMay);
			for (May may : mays) {
				mayForm.setMaMay(may.getMaMay());
				mayForm.setViTri(may.getViTri());
				mayForm.setTrangThai(may.getTrangThai());
			}
			
			return mapping.findForward("xoaMay");
		}
	}
}
