package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import form.DangKySDDichVuForm;
import model.bean.DichVu;
import model.bean.KhachHang;
import model.bo.DangKySDDichVuBO;
import model.bo.DichVuBO;
import model.bo.KhachHangBO;

public class DangKySDDVAction extends DispatchAction{
	
	public ActionForward dangKySDDichVu(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DangKySDDichVuForm sdDichVuForm = (DangKySDDichVuForm) form;
		
		DangKySDDichVuBO sdDichVuBO = null;
		KhachHangBO khachHangBO = new KhachHangBO();
		DichVuBO dichVuBO = new DichVuBO();
		List<KhachHang> khachHangs = khachHangBO.getKhachHang();
		List<DichVu> dichVus = dichVuBO.getDV();
		
		sdDichVuForm.setListKH(khachHangs);
		sdDichVuForm.setListDV(dichVus);
		
		if ("Đăng ký".equals(sdDichVuForm.getSubmit())) {
			String maKH = sdDichVuForm.getMaKH();
			String maDV = sdDichVuForm.getMaDV();
			String ngaySD = sdDichVuForm.getNgaySD();
			String gioSD = sdDichVuForm.getGioSD();
			int soLuong = sdDichVuForm.getSoLuong();
			
			sdDichVuBO = new DangKySDDichVuBO();
			sdDichVuBO.dangKySDDV(maKH, maDV, ngaySD, gioSD, soLuong);

			return mapping.findForward("dangKySDDichVuOK");
		} else {
			return mapping.findForward("dangKySDDichVu");
		}
	}
}
