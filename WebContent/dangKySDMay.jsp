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
<title>Đăng ký sử dụng máy</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/style.css"/>
	<script src="js/jquery-1.11.2.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<style type="text/css">
		.errors{
			color: red;
		}
	</style>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
	<div class="container">
	    <h3>Đăng ký sử dụng máy</h3>
	    <br>
		<html:form action="/dangKySDMay" method="post">
	        <div class="row form-group">
	            <label class="col-lg-2">Mã máy</label>
	            <div class="col-lg-3">
	            	<html:select property="maMay" styleClass="form-control">
	            		<html:optionsCollection name="dangKySuDungMayForm" property="listMay" label="maMay" value="maMay" />
	            	</html:select>
	            <div class="errors"><html:errors property="errMaKHTrong"/></div>
	            </div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Mã khách hàng</label>
	            <div class="col-lg-3">
	            	<html:select property="maKH" styleClass="form-control">
	            		<html:optionsCollection name="dangKySuDungMayForm" property="listKH" label="maKH" value="maKH" />
	            	</html:select>
            		<div class="errors"><html:errors property="errMaMayTrong"/></div>
	            </div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Ngày bắt đầu sử dụng</label>
	            <div class="col-lg-3">
	            	<html:text property="ngayBDSD" styleClass="form-control"></html:text>
	            </div>
            	<div class="errors"><html:errors property="errNgayBDSDTrong"/></div>
            	<div class="errors"><html:errors property="errNgayBDSD_saiDinhDang"/></div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Giờ bắt đầu sử dụng</label>
	            <div class="col-lg-3">
	            	<html:text property="gioBDSD" styleClass="form-control" styleId="gioBDSDMay"></html:text>
	            </div>
	            <div class="errors"><html:errors property="errGioBDSDTrong"/></div>
	            <div class="errors"><html:errors property="errGioBDSD_SaiDinhDang"/></div>
	        </div>
	        <div class="row form-group">
	            <label class="col-lg-2">Thời gian sử dụng</label>
	            <div class="col-lg-3">
	            	<html:text property="thoiGianSD" styleClass="form-control"></html:text>
	            </div>
            	<div class="errors"><html:errors property="errThoiGianSDTrong"/></div>
	        </div>
	        <div class="row form-group">
	            <div class="col-lg-3 col-lg-offset-2">
	            	<html:submit styleClass="btn btn-primary" property="submit" value="Đăng ký sử dụng"></html:submit>
	                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
	            </div>
	        </div>
	    </html:form>
	    <br>
	</div>
<%@include file="header_footer/footer.jsp" %>
</body>
</html>