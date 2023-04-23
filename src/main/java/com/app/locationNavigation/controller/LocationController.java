package com.app.locationNavigation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.locationNavigation.model.Location;
import com.app.locationNavigation.navservice.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocationService service;

	@PostMapping("/add")
	public Location addLocation(@RequestBody Location location)
	{
		return service.addLocation(location);
	}

	@GetMapping("/get/{id}")
	public Location getLocation(@PathVariable int id) throws Exception {
		return service.getLocation(id);
	}

	@GetMapping("/get-all")
	public List<Location> getAll(){
		return service.getAllLocations();
	}
}
