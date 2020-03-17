package model.bo;

import java.util.List;

import model.bean.Login;
import model.dao.LoginDAO;

public class LoginBO {
	LoginDAO loginDAO = new LoginDAO();
	public List<Login> getLogin() {
		return loginDAO.getLogin();
	}
}
