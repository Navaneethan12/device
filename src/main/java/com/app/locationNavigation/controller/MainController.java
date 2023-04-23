package com.app.locationNavigation.controller;


import com.app.locationNavigation.Dto.NavigationDto;
import com.app.locationNavigation.model.Navigation;
import com.app.locationNavigation.navservice.NavigationService;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/navigate")
public class MainController {
	@Autowired
	private NavigationService service;
	
	@PostMapping("/add")
	public Navigation addNavigate(@RequestBody Navigation navigation)
	{
		return service.addNavigate(navigation);
	}
	
	
	@GetMapping("/get/{id}")
	public Navigation getNavigation(@PathVariable int id) throws Exception {
		return service.getNavigation(id);
	}

	@GetMapping("/get-all")
	public List<NavigationDto> getAllLatestNavigation(){
		return service.getAllLatestNavigation();
	}
}
