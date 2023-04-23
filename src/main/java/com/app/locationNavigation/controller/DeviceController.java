package com.app.locationNavigation.controller;

import java.util.List;

import com.app.locationNavigation.navservice.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.locationNavigation.model.Device;
import com.app.locationNavigation.navservice.DeviceService;

@RestController
@RequestMapping("/device")
public class DeviceController {

	@Autowired
	private DeviceService deviceService;

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/create")
	public Device createDevice(@RequestBody Device device) {
		return deviceService.createDevice(device);
	}
	
	@PutMapping("/update/{id}")
	public Device updateDevice(@PathVariable int id, @RequestBody Device device) throws Exception
	{
		return deviceService.updateDevice(id, device);
	}
	
	@GetMapping("/get/{id}")
	public Device getDeviceById(@PathVariable int id) throws Exception
	{
		return deviceService.getDevice(id);
	}
	
	@GetMapping("/get-all")
	public List<Device> getAll()
	{
		return deviceService.getAllDevices();
	}
}
