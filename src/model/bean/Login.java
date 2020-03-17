package model.bean;

public class Login {
	private String un;
	private String pw;

	public Login() {
	}

	public Login(String un, String pw) {
		this.un = un;
		this.pw = pw;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
