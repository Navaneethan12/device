package com.app.locationNavigation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.locationNavigation.model.Admin;
import com.app.locationNavigation.navservice.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	public AdminService adminService;

	@PostMapping("/create")
	public Admin createAdmin(@RequestBody Admin admin) {
		return adminService.createAdmin(admin); 
	}
	
	@PutMapping("/update/{id}")
	public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) throws Exception
	{
		return adminService.updateAdmin(id, admin);
	}
	
	@GetMapping("/get/{id}")
	public Admin getAdminByID(@PathVariable int id) throws Exception
	{
		return adminService.getAdmin(id);
	}
	
	@GetMapping("/get-all")
	public List<Admin> getAll()
	{
		return adminService.getAllAdmins();
	}
	
}
