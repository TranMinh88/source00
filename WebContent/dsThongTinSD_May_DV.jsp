<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Thông tin sử dụng máy và dịch vụ của khách hàng</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
<logic:empty name="thongTinSDMay_DichVu_Form" property="list">
	<h2 style="text-align: center; color: blue;">Không có danh sách để hiển thị</h2>
</logic:empty>
<logic:notEmpty name="thongTinSDMay_DichVu_Form" property="list">
	<div class="container">
	    <div class="bs-example">
	        <table class="table table-striped">
	            <thead>
	            <tr>
	                <th>Mã KH</th>
			        <th>Tên KH</th>
			        <th>Mã máy</th>
			        <th>Vị trí</th>
			        <th>Trạng thái</th>
			        <th>Ngày BĐầu SD máy</th>
			        <th>Giờ BĐầu SD máy</th>
					<th>Thời gian sử dụng máy</th>
					<th>Mã dịch vụ</th>
					<th>Ngày sử dụng dịch vụ</th>
					<th>Giờ sử dụng dịch vụ</th>
					<th>Số lượng</th>
					<th>Tổng tiền</th>
	            </tr>
	            </thead>
	            <tbody>
	            <logic:iterate name="thongTinSDMay_DichVu_Form" property="list" id="ds">
	            	<tr>
	                <th scope="row">
	                	<bean:write name="ds" property="maKH"/>
					</th>
	                <td>
	                	<bean:write name="ds" property="tenKH"/>
	                </td>
	                <td>
	                	<bean:write name="ds" property="maMay"/>
					</td>
					<td>
	                	<bean:write name="ds" property="viTri"/>
					</td>
					<td>
	                	<bean:write name="ds" property="trangThai"/>
					</td>
					<td>
	                	<bean:write name="ds" property="ngayBatDauSD"/>
					</td>
	                <td>
	                	<bean:write name="ds" property="gioBatDauSD"/>
	                </td>
	                <td>
	                	<bean:write name="ds" property="thoiGianSD"/>
					</td>
					<td>
	                	<bean:write name="ds" property="maDV"/>
					</td>
					<td>
	                	<bean:write name="ds" property="ngaySD"/>
					</td>
					<td>
	                	<bean:write name="ds" property="gioSD"/>
					</td>
					<td>
	                	<bean:write name="ds" property="soLuong"/>
					</td>
					<td>
	                	<bean:write name="ds" property="tongTien"/>
					</td>
	            </tr>
	            </logic:iterate>
	            </tbody>
	        </table>
	    </div>
	</div>
</logic:notEmpty>
	<%@include file="header_footer/footer.jsp" %>
</body>
</html>