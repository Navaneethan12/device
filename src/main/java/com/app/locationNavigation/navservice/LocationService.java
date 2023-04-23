package com.app.locationNavigation.navservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.locationNavigation.model.Location;


public interface LocationService {

	public Location addLocation(Location location);
	
	public Location getLocation(int id) throws Exception;
	
	public List<Location> getAllLocations();
}
