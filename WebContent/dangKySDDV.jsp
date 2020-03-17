<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng ký sử dụng dịch vụ</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/style.css"/>
	<script src="js/jquery-1.11.2.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<style type="text/css">
		.text_required {background-color: #FFFFBD;}
		
		.ime_mode_disabled {
		 ime-mode: disabled
		}
		
		form span {
			color: red;
		}
	</style>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
	<div class="container">
	    <h3>Đăng ký sử dụng dịch vụ</h3>
	    <br>
		<html:form action="/dangKySDDichVu?d=dangKySDDichVu" method="post" onreset="return checkSoNguyenDuong()" onsubmit="return checkSDDV()">
	        <div class="row form-group">
	            <label class="col-lg-2">Mã khách hàng</label>
	            <span id="errMaKH"></span>
	            <div class="col-lg-3">
	            	<html:select property="maKH" styleClass="form-control" styleId="maKH">
	            		<html:optionsCollection name="dangKySDDichVuForm" property="listKH" label="maKH" value="maKH" />
	            	</html:select>
	            </div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Mã dịch vụ</label>
	            <span id="errMaDV"></span>
	            <div class="col-lg-3">
	            	<html:select property="maDV" styleClass="form-control" styleId="maDV">
	            		<html:optionsCollection name="dangKySDDichVuForm" property="listDV" label="tenDV" value="maDV" />
	            	</html:select>
	            </div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Ngày sử dụng</label>
	            <span id="errNgaySD"></span>
	            <div class="col-lg-3">
	            	<%-- <html:text property="ngaySD" styleClass="form-control"></html:text> --%>
	            	<input class="form-control" type="date" name="ngaySD" id="ngaySD">
	            </div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Giờ bắt đầu sử dụng</label>
	            <span id="errGioBDSD"></span>
	            <div class="col-lg-3">
	            	<html:text property="gioSD" styleClass="form-control" styleId="gioBDSD"></html:text>
	            	<input type="text" name="name" class="text_required ime_mode_disabled" value="initial value" disabled="disabled">
	            	<!-- <input class="form-control" type="time" name="gioSD" id="gioBDSD"> -->
	            </div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Số lượng sử dụng</label>
	            <span id="errSlSD"></span>
	            <div class="col-lg-3">
	            	<html:text property="soLuong" styleClass="form-control" styleId="slSD"></html:text>
	            </div>
	        </div>
	        <div class="row form-group">
	            <div class="col-lg-3 col-lg-offset-2">
	            	<html:submit styleClass="btn btn-primary" property="submit" value="Đăng ký"></html:submit>
	                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
	            </div>
	        </div>
	    </html:form>
	    <br>
	</div>
<%@include file="header_footer/footer.jsp" %>
<script type="text/javascript" src="js/checkDangKySDDV.js"></script>
</body>
</html>