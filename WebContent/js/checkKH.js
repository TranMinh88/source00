function ktra() {
	var check=true;
	maKH = document.getElementById("maKH").value;
	tenKH = document.getElementById("tenKH").value;
	diaChi = document.getElementById("diaChi").value;
	sdt = document.getElementById("phone").value;
	email = document.getElementById("email").value;
	
	if(maKH == ""){
		document.getElementById("errMaKH").innerHTML = "<br>Mã khách hàng không được để trống!";
		check=false;
	} else {
		document.getElementById("errMaKH").innerHTML = "";
		var regexMaKH = new RegExp("^KH+[0-9\\-\\+]{3}$");
		if (regexMaKH.test(maKH) == false) {
			document.getElementById("errMaKH").innerHTML = "<br>Mã khách hàng phải có đinh dạng KHxxxxx (x là ký tự số)!";
			check=false;
		}
	}
	
	if (tenKH == "") {
		document.getElementById("errTenKH").innerHTML = "<br>Tên khách hàng không được để trống!";
		check=false;
	} else {
		document.getElementById("errTenKH").innerHTML = "";
	}
	
	if (diaChi == "") {
		document.getElementById("errDiaChiKH").innerHTML = "<br>Địa chỉ khách hàng không được để trống!";
		check=false;
	} else {
		document.getElementById("errDiaChiKH").innerHTML = "";
	}
	
	if (sdt == "") {
		document.getElementById("errsdtKH").innerHTML = "<br>Số điện thoại khách hàng không được để trống!";
		check=false;
	} else{
		document.getElementById("errsdtKH").innerHTML = "";			
		var regexSDT = new RegExp("^(09[01]|\\+849[01])+[0-9\\-\\+]{7}$");
		if (regexSDT.test(sdt) == false) {
			alert( "Số điện thoại phải có định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (+84)90xxxxxxx hoặc (+84)91xxxxxxx");
			check = false;
		}
	}
	if (email == "") {
		document.getElementById("errEmailKH").innerHTML = "<br>Email khách hàng không được để trống!";
		check=false;
	} else {
		document.getElementById("errEmailKH").innerHTML = "";
		var regexEmail = new RegExp("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
	    if(regexEmail.test(email)==false){
	    	alert("Sai định dạng Email!");
	    	check = false;
	    }
	}
	
	return check;
}