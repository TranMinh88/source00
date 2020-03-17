<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<div class="jumbotron">
	<h1 style="text-align: center;">QUẢN LÝ QUÁN NET<h1>      
</div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="./TranChu.jsp">Trang chủ</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Quản lý máy<span class="caret"></span></a>
	        <ul class="dropdown-menu">
	          <li><a href="may.do?ma=themMay">Tạo mới máy</a></li>
	          
	          <li><a href="may.do?ma=dsMay">Danh sách máy</a></li>
	          
	          <li><a href="dangKySDMay.do">Đăng ký sử dụng máy</a></li>
	        </ul>
	      </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Quản lý dịch vụ<span class="caret"></span></a>
	        <ul class="dropdown-menu">
	          <li><a href="dich-Vu.do?m=themDichVu">Thêm dịch vụ</a></li>
	          <li><a href="dich-Vu.do?m=dsDichVu">Danh sách dịch vụ</a></li>
	          <li><a href="dangKySDDichVu.do?d=dangKySDDichVu">Đăng ký sử dụng dịch vụ</a></li>
	        </ul>
	      </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Quản lý khách hàng<span class="caret"></span></a>
	        <ul class="dropdown-menu">
	          <li><a href="khach-Hang.do?k=themKH">Tạo mới khách hàng</a></li>
	          <li><a href="khach-Hang.do?k=dsKH">Danh sách khách hàng</a></li>
	        </ul>
	      </li>
        <li><a href="sdDv-May.do?s=dsDichVu">Thông tin sử dụng máy và dịch vụ</a></li>
        <li><a href="#">Giới thiệu</a></li>
      </ul>
    </div>
  </div>
</nav>