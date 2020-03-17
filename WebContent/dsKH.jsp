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
<title>Danh sách khách hàng</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
	<div class="container">
	    <div class="bs-example">
	    	<h3>Tìm kiếm</h3><input class="form-control" id="myInput" type="text" placeholder="Nhập để tìm.." style="width: 20%;">
	  		<br>
	        <table class="table table-striped table-bordered">
	            <thead>
	            <tr>
	                <th>Mã khách hàng</th>
	                <th>Tên khách hàng</th>
	                <th>Địa chỉ</th>
	                <th>Số điện thoại</th>
	                <th>Email</th>
	            </tr>
	            </thead>
	            <tbody id="myTable">
	            <logic:iterate name="khachHangForm" property="listKH" id="kh">
	            	<tr>
	                <th scope="row">
	                	<bean:write name="kh" property="maKH"/>
					</th>
	                <td>
	                	<bean:write name="kh" property="tenKH"/>
	                </td>
	                <td>
	                	<bean:write name="kh" property="diaChi"/>
					</td>
					<td>
	                	<bean:write name="kh" property="sdt"/>
					</td>
					<td>
	                	<bean:write name="kh" property="email"/>
					</td>
	            </tr>
	            </logic:iterate>
	            </tbody>
	        </table>
	    </div>
	</div>
	<script type="text/javascript" src="js/timKiem.js"></script>
	<%@include file="header_footer/footer.jsp" %>
</body>
</html>