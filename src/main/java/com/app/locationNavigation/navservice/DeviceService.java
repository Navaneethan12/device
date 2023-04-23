package com.app.locationNavigation.navservice;

import java.util.List;

import com.app.locationNavigation.model.Device;


public interface DeviceService {

	public Device createDevice(Device device);
	
	public Device updateDevice(int id, Device device) throws Exception;
	
	public Device getDevice(int id) throws Exception;
	
	public List<Device> getAllDevices();
}
