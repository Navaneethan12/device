package com.app.locationNavigation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Navigation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int locationId;

    private int deviceId;

    public Navigation() {
    }

    public Navigation(int id, int locationId, int deviceId) {
        this.id = id;
        this.locationId = locationId;
        this.deviceId = deviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}
