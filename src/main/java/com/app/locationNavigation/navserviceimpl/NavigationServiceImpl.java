package com.app.locationNavigation.navserviceimpl;


import com.app.locationNavigation.Dto.NavigationDto;
import com.app.locationNavigation.model.Navigation;
import com.app.locationNavigation.navservice.LocationService;
import com.app.locationNavigation.navservice.NavigationService;
import com.app.locationNavigation.repo.NavigationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavigationServiceImpl implements NavigationService {

	@Autowired
	private NavigationRepo repo;
	
	
	@Override
	public Navigation addNavigate(Navigation location) {
		
		return repo.save(location);
	}

	@Override
	public Navigation getNavigation(int id) throws Exception {
		return repo.findById(id).orElseThrow(() -> new Exception("id not found"));
	}

	@Override
	public List<NavigationDto> getAllLatestNavigation() {
		return repo.getLatestNavigationOfAllDevice();
	}

//	@Override
//	public Location getLocation(int id) {
//
//		return repo.findById(id).get();
//	}
//
//	@Override
//	public List<Location> getAllLocations() {
//
//		return repo.findAll();
//	}

}
