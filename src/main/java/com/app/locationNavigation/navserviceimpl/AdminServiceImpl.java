package com.app.locationNavigation.navserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.locationNavigation.model.Admin;
import com.app.locationNavigation.navservice.AdminService;
import com.app.locationNavigation.repo.AdminRepo;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepo repo;
	
	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public Admin updateAdmin(int id, Admin admin) throws Exception {
		Admin existingAdmin = repo.findById(id).orElseThrow(() -> new Exception("id not found"));
		if (existingAdmin != null) {
			existingAdmin.setName(admin.getName());
			existingAdmin.setEmail(admin.getEmail());
			existingAdmin.setContact(admin.getContact());
			return repo.save(existingAdmin);
		}
		return null;
	}

	@Override
	public Admin getAdmin(int id) throws Exception {
		return repo.findById(id).orElseThrow(() -> new Exception("id not found"));
	}

	@Override
	public List<Admin> getAllAdmins() {
		
		return repo.findAll();
	}
	
	

}
