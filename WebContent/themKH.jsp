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
    <title>Thêm khách hàng</title>
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
	    <h3>Thêm khách hàng</h3>
	    <br>
		<html:form action="/khach-Hang?k=themKH" method="post" onsubmit ="return ktra()">
	        <div class="row form-group">
            <label class="col-lg-2">Mã khách hàng</label>
            <span id="errMaKH" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="maKH" styleClass="form-control" styleId="maKH"></html:text>
            	<div id="loiTrong"><html:errors property="errMaKH"/></div>
            </div>
        </div>
        <div class="row form-group">
            <label class="col-lg-2">Tên khách hàng</label>
            <span id="errTenKH" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="tenKH" styleClass="form-control" styleId="tenKH"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errTenKH"/></div> --%>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Địa chỉ</label>
            <span id="errDiaChiKH" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="diaChi" styleClass="form-control" styleId="diaChi"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errDiaChi"/></div> --%>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Số điện thoại</label>
            <span id="errsdtKH" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="sdt" styleClass="form-control" styleId="phone"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="errSdt"/></div> --%>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Email</label>
            <span id="errEmailKH" class="mauErr text-danger"></span>
            <div class="col-lg-3">
            	<html:text property="email" styleClass="form-control" styleId="email"></html:text>
            	<%-- <div id="loiTrong"><html:errors property="erremail"/></div> --%>
            </div>
        </div>
        <div class="row form-group">
            <div class="col-lg-3 col-lg-offset-2">
            	<html:submit styleClass="btn btn-primary" property="submit" value="Thêm khách hàng"></html:submit>
                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
            </div>
        </div>
	    </html:form>
	    <br>
	</div>
<script type="text/javascript" src="js/checkKH.js"></script>
<%@include file="header_footer/footer.jsp" %>
</body>
</html>