package com.itcinema.services;

import java.util.List;

import com.itcineme.model.MovieAdmin;

public interface MovieAdminInterface {
public boolean addAdmin(String userName,String email,String mobile,String password);
public boolean login(String userName,String password);
public List<MovieAdmin> displayAll();
}
