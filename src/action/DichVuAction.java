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
import form.DichVuForm;
import model.bean.DichVu;
import model.bo.DichVuBO;

public class DichVuAction extends DispatchAction{
	DichVuBO dichVuBO = new DichVuBO();
	
	public ActionForward themDichVu(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DichVuForm dichVuForm = (DichVuForm) form;
		
		if ("Thêm dịch vụ".equals(dichVuForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();
			if (StringProcess.notVaild(dichVuForm.getMaDV())) {
				actionErrors.add("errMaDV", new ActionMessage("err.maDV.trong"));
			} else {
				List<DichVu> dichVus = dichVuBO.getDV();
				for (DichVu dichVu : dichVus) {
					if (dichVu.getMaDV().equals(dichVuForm.getMaDV())) {
						actionErrors.add("errMaDV", new ActionMessage("err.maDV.biTrung"));
					}
				}
			}
			
			if (StringProcess.notVaild(dichVuForm.getTenDV())) {
				actionErrors.add("errTenDV", new ActionMessage("err.tenDV.trong"));
			}
			
			if (StringProcess.notVaild(dichVuForm.getDonViTinh())) {
				actionErrors.add("errDonViTinh", new ActionMessage("err.donViTinh.trong"));
			}
			
			if (StringProcess.notVaild(dichVuForm.getDonViTinh())) {
				actionErrors.add("errDonGia", new ActionMessage("err.donGia.trong"));
			}
			
			saveErrors(request, actionErrors);
			if(actionErrors.size()>0){
				return mapping.findForward("taoMoiDVError");
			}
		}
		
		if ("Thêm dịch vụ".equals(dichVuForm.getSubmit())) {
			String maDV = dichVuForm.getMaDV();
			String tenDV = dichVuForm.getTenDV();
			String donViTinh = dichVuForm.getDonViTinh();
			long donGia = dichVuForm.getDonGia();
			
			dichVuBO.themDV(maDV, tenDV, donViTinh, donGia);

			return mapping.findForward("themDichVuOK");
		} else {
			return mapping.findForward("themDichVu");
		}
	}
	
	/**
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward suaDichVu(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DichVuForm dichVuForm = (DichVuForm) form;
		
		String maDV = dichVuForm.getMaDV();
		if ("Lưu lại".equals(dichVuForm.getSubmit())) {
			String tenDV = dichVuForm.getTenDV();
			String donViTinh = dichVuForm.getDonViTinh();
			long donGia = dichVuForm.getDonGia();
			
			dichVuBO.suaDV(maDV, tenDV, donViTinh, donGia);
			
			return mapping.findForward("suaDichVuOK");
		} else {
			DichVu dichVu = dichVuBO.getDVByMaDV(maDV);
			dichVuForm.setMaDV(dichVu.getMaDV());
			dichVuForm.setTenDV(dichVu.getTenDV());
			dichVuForm.setDonViTinh(dichVu.getDonViTinh());
			dichVuForm.setDonGia(dichVu.getDonGia());
			
			return mapping.findForward("suaDichVu");
		}
	}
	
	public ActionForward xoaDichVu(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DichVuForm dichVuForm = (DichVuForm) form;

		String maDV = dichVuForm.getMaDV();
		if ("Xác nhận xóa".equals(dichVuForm.getSubmit())) {
			dichVuBO.xoaDV(maDV);
			
			return mapping.findForward("xoaDichVuOK");
		} else {
			DichVu dichVu = dichVuBO.getDVByMaDV(maDV);
			dichVuForm.setMaDV(dichVu.getMaDV());
			dichVuForm.setTenDV(dichVu.getTenDV());
			dichVuForm.setDonViTinh(dichVu.getDonViTinh());
			dichVuForm.setDonGia(dichVu.getDonGia());
			
			return mapping.findForward("xoaDichVu");
		}
	}
	
	public ActionForward dsDichVu(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DichVuForm dichVuForm = (DichVuForm) form;
		List<DichVu> dichVus = dichVuBO.getDV();
		dichVuForm.setListDV(dichVus); 
		
		return mapping.findForward("dsDV");
	}
}
