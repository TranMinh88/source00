function checkSDDV() {
	var check = true;
	maKH = document.getElementById("maKH").value;
    maDV = document.getElementById("maDV").value;
    ngaySD = document.getElementById("ngaySD").value;
    gioBDSD = document.getElementById("gioBDSD").value;
    slSD = document.getElementById("slSD").value;
    
    if(maKH == ""){
    	document.getElementById("errMaKH").innerHTML = "<br>Mã khách hàng không được để trống!";
		check=false;
    } else {
    	document.getElementById("errMaKH").innerHTML = "";
	}
    
    if(maDV == ""){
    	document.getElementById("errMaDV").innerHTML = "<br>Mã dịch vụ không được để trống!";
		check=false;
    } else {
    	document.getElementById("errMaDV").innerHTML = "";
	}
    
    if(ngaySD == ""){
    	document.getElementById("errNgaySD").innerHTML = "<br>Bạn chưa nhập ngày sử dụng!";
		check=false;
    } else {
    	document.getElementById("errNgaySD").innerHTML = "";
	}
    
    if(gioBDSD == ""){
    	document.getElementById("errGioBDSD").innerHTML = "<br>Bạn chưa nhập giờ bắt đầu sử dụng!";
		check=false;
    } else {
    	document.getElementById("errGioBDSD").innerHTML = "";
    	//var gioSD_regex = /\d\d:[0-5]{1}[0-9]{1}$/;
    	
    	var gioSD_regex = /^[00-23]{2}:[0-5][0-9]$/;
    	if (gioSD_regex.test(gioBDSD) == false) {
    		document.getElementById("errGioBDSD").innerHTML = "<br>Bạn nhập sai định dạng giờ bắt đầu sử dụng!";
    		check=false;
		}
	}
    
    if(slSD == ""){
    	document.getElementById("errSlSD").innerHTML = "<br>Bạn chưa nhập số lượng sử dụng!";
		check=false;
    } else {
    	document.getElementById("errSlSD").innerHTML = "";
    	var price_regex = /(^[0-9]*$)/g;
     	if (slSD < 1 || price_regex.test(slSD) == false) {
     		//alert( "Số lượng phải là số nguyên dương và phải là kiểu Số!");
     		document.getElementById("errSlSD").innerHTML = "<br>Số lượng phải là số nguyên dương!";
     		check = false;
     	}
    	
    	/*if (slSD <= 0) {
    		document.getElementById("errSlSD").innerHTML = "<br>Số lượng phải là số nguyên dương!";
    		check=false;
		}*/
	}
    
    return check;
}