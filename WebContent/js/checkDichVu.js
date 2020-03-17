function checkDV() {
	var check = true;
	maDV = document.getElementById("maDV").value;
    tenDichVu = document.getElementById("tenDV").value;
    donViTinh = document.getElementById("donViTinh").value;
    donGia = document.getElementById("donGia").value;
    
    if(maDV == ""){
    	document.getElementById("errMaDV").innerHTML = "<br>Mã dịch vụ không được để trống!";
		check=false;
    } else {
    	document.getElementById("errMaDV").innerHTML = "";
    	var regexMaDV = new RegExp("^DV+[0-9\\-\\+]{3}$");
		if (regexMaDV.test(maDV) == false) {
			document.getElementById("errMaDV").innerHTML = "<br>Mã dịch vụ phải có đinh dạng DVxxx (x là ký tự số)!";
			check=false;
		}
	}
    
    if(tenDichVu == ""){
    	document.getElementById("errTenDV").innerHTML = "<br>Bạn chưa nhập tên dịch vụ!";
		check=false;
    } else {
    	document.getElementById("errTenDV").innerHTML = "";
	}
    
    if(donViTinh == ""){
    	document.getElementById("errDonViTinh").innerHTML = "<br>Bạn chưa nhập đơn vị tính!";
		check=false;
    } else {
    	document.getElementById("errDonViTinh").innerHTML = "";
	}
    
    if(donGia == ""){
    	document.getElementById("errDonGia").innerHTML = "<br>Bạn chưa nhập đơn giá!";
		check=false;
    } else {
    	if(donGia > 0){
    		document.getElementById("errDonGia").innerHTML = "";    		
    	} else {
    		document.getElementById("errDonGia").innerHTML = "Đơn giá phải là số nguyên dương!";
    		check = false;
    	}
	}
    
    return check;
}