//phone
function checkPhone() {
	var phone = document.getElementById("phone").value;
	var regexSDT = new RegExp("^(09[01]|\\+849[01])+[0-9\\-\\+]{7}$");
	if (regexSDT.test(phone) == false) {
		alert( "Số điện thoại phải có định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (+84)90xxxxxxx hoặc (+84)91xxxxxxx");
		return false;
	}
	return true;
}

//Email
function checkEmail() {
	var emaill = document.getElementById("emaill").value;
   var regexEmail = new RegExp("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
   if(regexEmail.test(emaill)==false){
   	alert("Sai định dạng Email!");
   	return false;
   }
   return true;
}

//check trung MaKH
 function checkMaKH() {
	var maKH = document.getElementById("maKH").value;
	var regexmaKH = new RegExp("^KH+[0-9\\-\\+]{3}$");
	if(regexmaKH.test(maKH)==false){
		alert("Mã khách hàng phải có đinh dạng KHxxxxx (x là ký tự số)!");
		return false;
	}
	return true;
}
//Xac Nhan
 function xacNhanAn() {
	var xacNhan = confirm("Bạn có muốn xóa không?");
		return xacNhan;
}

 //So Luong,thoi gian,Don gia >0

 function checkSoNguyenDuong() {
 	var price = document.getElementById("soNguyenDuong").value;
 	var price_regex = /(^[0-9]*$)/g;
 	if (price < 1 || price_regex.test(price) == false) {
 		alert( "Ðon giá phải là số nguyên dương và phải là kiểu Số!");
 		return false;
 	}
 	return true;
 }
//  Dinh Dang Ngay
 function checkDate() {
	 	var date = document.getElementById("date").value;
	 	alert(date);
	 	var date_regex =/(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/](0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19|[2-9][0-9])\d\d$)|(^29[/]02[/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)/;
	 	if ( date_regex.test(date) == false) {
	 		alert( "Định Dạng Ngày Sai!");
	 		return false;
	 	}
	 	return true;
	 }
 
 //check Khach Hang
 function check() {
	 var result = false;
	 if(checkMaKH() && checkEmail() && checkPhone() && checkPrice())
		 result = true;
	 return result;
 }
 //check Dich Vu
 function check1() {
	 var result = false;
	 if( checkPrice() && checkDate()){
		 result = true;
	 }
	 return result;
 }