package com.itcinema.services;
import java.util.List;
import com.itcinema.dao.MovieAdminDAO;
import com.itcineme.model.MovieAdmin;

public class MovieAdminimpl implements MovieAdminInterface{
	
	@Override
	public boolean addAdmin(String userName, String email, String mobile, String password) {
		MovieAdmin admin=new MovieAdmin();
		admin.setUserName(userName);
		admin.setEmail(email);
		admin.setMobile(mobile);
		admin.setPassword(password);
		return MovieAdminDAO.addAdmin(admin);
	}
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return MovieAdminDAO.login(userName,password);
	}
	
	public List<MovieAdmin> displayAll(){
		return MovieAdminDAO.displayAll();
	}

}
