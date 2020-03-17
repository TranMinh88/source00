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
<title>Danh sách dịch vụ</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
	<div class="container">
	    <div class="bs-example">
	   	  <div class="search-container">
		    <form action="">
		    	<h3>Tìm kiếm</h3><input class="form-control" id="myInput" type="text" placeholder="Nhập để tìm.." style="width: 20%;">
	  			<br>
		    </form>
		  </div>
	        <table class="table table-striped table-bordered">
	            <thead>
	            <tr>
	                <th>Mã dịch vụ</th>
	                <th>Tên dịch vụ</th>
	                <th>Đơn vị tính</th>
	                <th>Đơn giá</th>
	                <th></th>
	            </tr>
	            </thead>
	            <tbody id="myTable">
	            <logic:iterate name="dichVuForm" property="listDV" id="dv">
	            	<tr>
	                <th scope="row">
	                	<bean:write name="dv" property="maDV"/>
					</th>
	                <td>
	                	<bean:write name="dv" property="tenDV"/>
	                </td>
	                <td>
	                	<bean:write name="dv" property="donViTinh"/>
					</td>
					<td>
	                	<bean:write name="dv" property="donGia"/>
					</td>
	                <td>
	                	<bean:define id="mdv" name="dv" property="maDV"></bean:define>
	                	<html:link action="/dich-Vu?m=suaDichVu&maDV=${mdv}">
	                		<span class="glyphicon glyphicon-edit"></span>
	                	</html:link>
	                	<html:link action="/dich-Vu?m=xoaDichVu&maDV=${mdv}" style="margin-left: 30px;">
	                		<span class="glyphicon glyphicon-trash"></span>
	                	</html:link>
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