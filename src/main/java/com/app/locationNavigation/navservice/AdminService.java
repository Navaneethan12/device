package com.app.locationNavigation.navservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.locationNavigation.model.Admin;
import com.app.locationNavigation.repo.AdminRepo;


public interface AdminService {

	public Admin createAdmin(Admin admin);
	
	public Admin updateAdmin(int id, Admin admin) throws Exception;
	
	public Admin getAdmin(int id) throws Exception;
	
	public List<Admin> getAllAdmins();
}
