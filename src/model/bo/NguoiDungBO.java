package model.bo;

import model.dao.NguoiDungDAO;

/**
 * NguoiDungBO.java
 *
 * Version 1.0
 *
 * Date: Jan 21, 2015
 *
 * Copyright 
 *
 * Modification Logs:
 * DATE                 AUTHOR          DESCRIPTION
 * -----------------------------------------------------------------------
 * Jan 21, 2015        	DaiLV2          Create
 */

public class NguoiDungBO {
	NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();

	public boolean checkLogin(String tenDangNhap, String matKhau) {
		return nguoiDungDAO.checkLogin(tenDangNhap, matKhau);
	}
	
	/*public static void main(String[] args) {
		
      Date date = new Date("02/02/2000 12:30:23");
      Time time = new Time(50, 20, 30);
      SimpleDateFormat sdf = new SimpleDateFormat("h:m:s");
      System.out.println("hour in h format : "
      + sdf.format(time));
	}*/
}
