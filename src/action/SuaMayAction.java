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

public class SuaMayAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		MayBO mayBO = new MayBO();
		List<May> mays;
		MayForm mayForm = (MayForm) form;
		
		String maMay = mayForm.getMaMay();
		if ("Lưu lại".equals(mayForm.getSubmit())) {
			String viTri = mayForm.getViTri();
			String trangThai = mayForm.getTrangThai();
			
			//MayBO mayBO = new MayBO();
			mayBO.suaMay(maMay, viTri, trangThai);
			
			return mapping.findForward("suaMayOK");			
		} else {
			mays = mayBO.getMayByID(maMay);
			for (May may : mays) {
				mayForm.setMaMay(may.getMaMay());
				mayForm.setViTri(may.getViTri());
				mayForm.setTrangThai(may.getTrangThai());
			}
			
			return mapping.findForward("suaMay");
		}
	}
}
