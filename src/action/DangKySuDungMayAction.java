package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.StringProcess;
import form.DangKySuDungMayForm;
import model.bean.KhachHang;
import model.bean.May;
import model.bo.DangKySDMayBO;
import model.bo.KhachHangBO;
import model.bo.MayBO;

public class DangKySuDungMayAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DangKySuDungMayForm suDungMayForm = (DangKySuDungMayForm) form;
		
		MayBO mayBO = new MayBO();
		KhachHangBO khachHangBO = new KhachHangBO();
		List<May> listMay = mayBO.getMay();
		List<KhachHang> listKH = khachHangBO.getKhachHang();
		
		suDungMayForm.setListMay(listMay);
		suDungMayForm.setListKH(listKH);
		
		// nhan nut dang ky o trang dang ky sd may --->>> validate
		if ("Đăng ký sử dụng".equals(suDungMayForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();
			if (StringProcess.notVaild(suDungMayForm.getMaKH())) {
				actionErrors.add("errMaKHTrong", new ActionMessage("err.maKH.trong"));
			}
			
			if (StringProcess.notVaild(suDungMayForm.getMaMay())) {
				actionErrors.add("errMaMayTrong", new ActionMessage("err.maMay.trong"));
			}
			
			if (StringProcess.notVaild(suDungMayForm.getNgayBDSD())) {
				actionErrors.add("errNgayBDSDTrong", new ActionMessage("err.ngayBDSD.trong"));
			} else {
				String regex = "((((0[1-9]|1[0-9]|2[0-8])[/-](0[1-9]|1[012]))|((29|30|31)[/-](0[13578]|1[02]))|((29|30)[/-](0[4,6,9]|11)))[/-](19|[2-9][0-9])\\d\\d$)|(^29[/-]02[/-](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
				if (suDungMayForm.getNgayBDSD().matches(regex) == false) {
					actionErrors.add("errNgayBDSD_saiDinhDang", new ActionMessage("err.NgayBDSD.saiDinhDang"));
				}
			}
			
			if (StringProcess.notVaild(suDungMayForm.getGioBDSD())) {
				actionErrors.add("errGioBDSDTrong", new ActionMessage("err.gioBDSD.trong"));
			} else {
				String regex = "[00-23]{2}:[0-5][0-9]$";
				if (suDungMayForm.getGioBDSD().matches(regex) == false) {
					actionErrors.add("errGioBDSD_SaiDinhDang", new ActionMessage("err.gioBDSD.saiDinhDang"));
				}
			}
			
			//int thoiGianSDMay = suDungMayForm.getThoiGianSD();
			if (StringProcess.notVaild(String.valueOf(suDungMayForm.getThoiGianSD()))) {
				actionErrors.add("errThoiGianSDTrong", new ActionMessage("err.thoiGianSD.trong"));
			} else {
				if (suDungMayForm.getThoiGianSD() <= 0) {
					actionErrors.add("errThoiGianSDTrong", new ActionMessage("err.thoiGianSD.am"));
				}				
			}
			
			saveErrors(request, actionErrors);
			if (actionErrors.size() > 0) {
				return mapping.findForward("Err_dangKySDMay");
			}
		}
		
		// nhan nut dang ky o trang dang ky sd may
		if ("Đăng ký sử dụng".equals(suDungMayForm.getSubmit())) {
			String maKH = suDungMayForm.getMaKH();
			String maMay = suDungMayForm.getMaMay();
			String ngayBDSD = suDungMayForm.getNgayBDSD();
			String gioBDSD = suDungMayForm.getGioBDSD();
			int thoiGianSD = suDungMayForm.getThoiGianSD();
			
			DangKySDMayBO dangKySDMayBO = new DangKySDMayBO();
			dangKySDMayBO.dangKySDMay(maKH, maMay, ngayBDSD, gioBDSD, thoiGianSD);
			
			return mapping.findForward("dangKySDMayOK");
		} else { // chuyen sang trang them may
			return mapping.findForward("dangKySDMay");
		}
	}
}
