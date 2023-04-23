package com.app.locationNavigation.navserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.locationNavigation.model.Location;
import com.app.locationNavigation.navservice.LocationService;
import com.app.locationNavigation.repo.LocationRepo;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepo repo;
	
	
	@Override
	public Location addLocation(Location location) {
		
		return repo.save(location);
	}

	@Override
	public Location getLocation(int id) throws Exception {
		
		return repo.findById(id).orElseThrow(() -> new Exception("id not found"));
	}

	@Override
	public List<Location> getAllLocations() {
		
		return repo.findAll();
	}

}
