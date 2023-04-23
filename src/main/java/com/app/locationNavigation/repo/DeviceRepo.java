package com.app.locationNavigation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.locationNavigation.model.Device;

public interface DeviceRepo extends JpaRepository<Device, Integer>{

}
