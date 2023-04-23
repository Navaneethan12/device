package com.app.locationNavigation.navservice;

import com.app.locationNavigation.Dto.NavigationDto;
import com.app.locationNavigation.model.Navigation;

import java.util.List;


public interface NavigationService {

	public Navigation addNavigate(Navigation navigation);
	
	public Navigation getNavigation(int id) throws Exception;
	
	public List<NavigationDto> getAllLatestNavigation();
}
