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
    <meta charset="UTF-8">
    <title>Thêm dịch vụ</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
    	#loiTrong {
    		color: red;
    	}
    	.mauErr {
    		color: red;
    	}
    </style>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
	<div class="container">
	    <h3>Thêm dịch vụ</h3>
	    <br>
		<html:form action="/dich-Vu?m=themDichVu" method="post" onsubmit="return checkDV()">
	        <div class="row form-group">
            <label class="col-lg-2">Mã dịch vụ</label>
            <span id="errMaDV" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="maDV" styleClass="form-control" styleId="maDV"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errMaDV"/></div> --%>
            </div>
        </div>
        <div class="row form-group">
            <label class="col-lg-2">Tên dịch vụ</label>
            <span id="errTenDV" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="tenDV" styleClass="form-control" styleId="tenDV"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errTenDV"/></div> --%>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Đơn vị tính</label>
            <span id="errDonViTinh" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="donViTinh" styleClass="form-control" styleId="donViTinh"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errDonViTinh"/></div> --%>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Đơn giá</label>
            <span id="errDonGia" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="donGia" styleClass="form-control" styleId="donGia"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errDonGia"/></div> --%>
            </div>
        </div>
	        <div class="row form-group">
	            <div class="col-lg-3 col-lg-offset-2">
	            	<html:submit styleClass="btn btn-primary" property="submit" value="Thêm dịch vụ"></html:submit>
	                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
	            </div>
	        </div>
	    </html:form>
	    <br>
	</div>
<%@include file="header_footer/footer.jsp" %>
<script type="text/javascript" src="js/checkDichVu.js"></script>
</body>
</html>