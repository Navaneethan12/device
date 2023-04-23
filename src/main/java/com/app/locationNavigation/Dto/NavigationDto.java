package com.app.locationNavigation.Dto;

public class NavigationDto {

    private int id;
    private int deviceId;
	private String deviceName;
	private String deviceCategory;
	private String deviceType;
	private boolean deviceStatus;
	private String locationName;
	private int locationId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceCategory() {
		return deviceCategory;
	}

	public void setDeviceCategory(String deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public boolean isDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(boolean deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public NavigationDto(int id, int deviceId, String deviceName, String deviceCategory, String deviceType,
			boolean deviceStatus, int locationId,String locationName) {
		super();
		this.id = id;
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceCategory = deviceCategory;
		this.deviceType = deviceType;
		this.deviceStatus = deviceStatus;
		this.locationId = locationId;
		this.locationName = locationName;
	}

	public NavigationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
