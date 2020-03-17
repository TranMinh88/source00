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
    <title>Sửa máy</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header_footer/header.jsp" %>
<div class="container">
    <h3>Sửa máy có mã: 
    	<bean:write name="mayForm" property="maMay"/>
    </h3>
    <br>
	<html:form action="/may?ma=suaMay" method="post">
        <div class="row form-group">
            <label class="col-lg-2">Mã máy</label>
            <div class="col-lg-3">
            	<html:text property="maMay" styleClass="form-control" readonly="true"></html:text>
            </div>
        </div>
        <div class="row form-group">
            <label class="col-lg-2">Vị trí</label>
            <div class="col-lg-3">
            	<html:text property="viTri" styleClass="form-control"></html:text>
            </div>
        </div>
        <div class="row form-group">    
            <label class="col-lg-2">Trạng thái</label>
            <div class="col-lg-3">
            	<html:text property="trangThai" styleClass="form-control"></html:text>
            </div>
        </div>
        <div class="row form-group">
            <div class="col-lg-3 col-lg-offset-2">
                <html:submit styleClass="btn btn-primary" property="submit" value="Lưu lại"></html:submit>
                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
            </div>
        </div>
    </html:form>
</div>
<%@include file="header_footer/footer.jsp" %>
</body>
</html>