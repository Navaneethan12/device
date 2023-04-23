package com.app.locationNavigation.navserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.locationNavigation.model.Device;
import com.app.locationNavigation.navservice.DeviceService;
import com.app.locationNavigation.repo.DeviceRepo;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceRepo repo;
	
	@Override
	public Device createDevice(Device device) {
		
		return repo.save(device);
	}

	@Override
	public Device updateDevice(int id, Device device) throws Exception {
		
		Device existingDevice = repo.findById(id).orElseThrow(() -> new Exception("id not found"));
		if (existingDevice != null) {
			existingDevice.setName(device.getName());
			existingDevice.setCategory(device.getCategory());
			existingDevice.setType(device.getType());
			existingDevice.setStatus(device.getStatus());
			return repo.save(existingDevice);
		}
		
		return null;
	}

	@Override
	public Device getDevice(int id) throws Exception {
		
		return repo.findById(id).orElseThrow(() -> new Exception("id not found"));
	}

	@Override
	public List<Device> getAllDevices() {
		
		return repo.findAll();
	}

}
