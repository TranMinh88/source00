<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Sửa dịch vụ</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
<div class="container">
    <h3>Xóa dịch vụ có mã: 
    	<bean:write name="dichVuForm" property="maDV"/>
    </h3>
    <br>
	<html:form action="/dich-Vu?m=xoaDichVu" method="post">
        <div class="row form-group">
            <label class="col-lg-2">Mã dịch vụ</label>
            <div class="col-lg-3">
            	<html:text property="maDV" styleClass="form-control" readonly="true"></html:text>
            </div>
        </div>
        <div class="row form-group">
            <label class="col-lg-2">Tên dịch vụ</label>
            <div class="col-lg-3">
            	<html:text property="tenDV" styleClass="form-control" readonly="true"></html:text>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Đơn vị tính</label>
            <div class="col-lg-3">
            	<html:text property="donViTinh" styleClass="form-control" readonly="true"></html:text>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Đơn giá</label>
            <div class="col-lg-3">
            	<html:text property="donGia" styleClass="form-control" readonly="true"></html:text>
            </div>
        </div>
        <div class="row form-group">
            <div class="col-lg-3 col-lg-offset-2">
                <html:submit styleClass="btn btn-primary" property="submit" value="Xác nhận xóa"></html:submit>
                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
            </div>
        </div>
    </html:form>
</div>
<%@include file="header_footer/footer.jsp" %>
</body>
</html>