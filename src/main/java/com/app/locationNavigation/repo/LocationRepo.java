package com.app.locationNavigation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.locationNavigation.model.Location;

public interface LocationRepo extends JpaRepository<Location, Integer>{

}
