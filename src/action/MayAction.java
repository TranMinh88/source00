package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.actions.DispatchAction;

import common.StringProcess;
import form.MayForm;
import model.bean.May;
import model.bo.MayBO;

public class MayAction extends DispatchAction{
	
	public ActionForward themMay(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		MayForm mayForm = (MayForm) form;
		MayBO mayBO = new MayBO();
		List<May> mays = mayBO.getMay();
		
		if ("Thêm mới máy".equals(mayForm.getSubmit())) {
			
			ActionErrors actionErrors = new ActionErrors();
			if (StringProcess.notVaild(mayForm.getMaMay())) {
				actionErrors.add("errMaMay", new ActionMessage("err.maMay.trong"));
			} else {
				for (May may : mays) {
					if (may.getMaMay().equals(mayForm.getMaMay())) {
						actionErrors.add("errMaMay", new ActionMessage("err.maMay.biTrung"));
					}
				}
			}
			
			if (StringProcess.notVaild(mayForm.getViTri())) {
				actionErrors.add("errViTri", new ActionMessage("err.viTri.trong"));
			}
			
			if (StringProcess.notVaild(mayForm.getTrangThai())) {
				actionErrors.add("errTrangThai", new ActionMessage("err.trangThai.trong"));
			}
			
			saveErrors(request, actionErrors);
			if(actionErrors.size()>0){
				return mapping.findForward("taoMoiMayError");
			}
		}
		
		// nhan nut xac nhan them o trang them may
		if ("Thêm mới máy".equals(mayForm.getSubmit())) {
			String maMay = mayForm.getMaMay();
			String viTri = mayForm.getViTri();
			String trangThai = mayForm.getTrangThai();
			
			
			mayBO.themMay(maMay, viTri, trangThai);
			
			return mapping.findForward("themMayOK");
		} else { // chuyen sang trang them may
			return mapping.findForward("themMay");
		}		
	}
	
	public ActionForward suaMay(ActionMapping mapping, ActionForm form, HttpServletRequest request,
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
	
	public ActionForward xoaMay(ActionMapping mapping, ActionForm form, HttpServletRequest request,
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
	
	public ActionForward dsMay(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		MayForm mayForm = (MayForm) form;
		
		// lay ds may
		MayBO mayBO = new MayBO();
		List<May> mays = mayBO.getMay();
		mayForm.setListMay(mays);
		
		return mapping.findForward("dsMay");
	}
}
