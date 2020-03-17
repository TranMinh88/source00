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
import form.KhachHangForm;
import model.bean.KhachHang;
import model.bo.KhachHangBO;

public class KhachHangAction extends DispatchAction{
	KhachHangBO khachHangBO = new KhachHangBO();
	
	public ActionForward themKH(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		KhachHangForm khachHangForm = (KhachHangForm) form;
		
		
		if ("Thêm khách hàng".equals(khachHangForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();
			if (StringProcess.notVaild(khachHangForm.getMaKH())) {
				actionErrors.add("errMaKH", new ActionMessage("err.maKH.trong"));
			}/* else {
				List<KhachHang> khachHangs = khachHangBO.getKhachHang();
				for (KhachHang khachHang : khachHangs) {
					if (khachHang.getMaKH().equals(khachHangForm.getMaKH())) {
						actionErrors.add("errMaKH", new ActionMessage("err.maKH.biTrung"));
					}					
				}
			}*/
			
			if (StringProcess.notVaild(khachHangForm.getTenKH())) {
				actionErrors.add("errTenKH", new ActionMessage("err.tenKH.trong"));
			}
			
			if (StringProcess.notVaild(khachHangForm.getDiaChi())) {
				actionErrors.add("errDiaChi", new ActionMessage("err.diaChi.trong"));
			}
			
			if (StringProcess.notVaild(khachHangForm.getEmail())) {
				actionErrors.add("erremail", new ActionMessage("err.email.trong"));
			}
			
			if (StringProcess.notVaild(khachHangForm.getSdt())) {
				actionErrors.add("errSdt", new ActionMessage("err.Sdt.trong"));
			}
			
			saveErrors(request, actionErrors);
			if(actionErrors.size()>0){
				return mapping.findForward("taoKHError");
			}
		}
		
		if ("Thêm khách hàng".equals(khachHangForm.getSubmit())) {
			String maKH = khachHangForm.getMaKH();
			String tenKH = khachHangForm.getTenKH();
			String diaChi = khachHangForm.getDiaChi();
			String sdt = khachHangForm.getSdt();
			String email = khachHangForm.getEmail();
			
			khachHangBO.themKH(maKH, tenKH, diaChi, sdt, email);

			return mapping.findForward("themKHOK");
		} else {
			return mapping.findForward("themKH");
		}
	}
	
	public ActionForward dsKH(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		KhachHangForm khachHangForm = (KhachHangForm) form;
		List<KhachHang> khachHangs = khachHangBO.getKhachHang();
		khachHangForm.setListKH(khachHangs);
		
		return mapping.findForward("dsKH");
	}
}
