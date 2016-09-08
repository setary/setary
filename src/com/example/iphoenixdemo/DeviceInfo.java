package com.example.iphoenixdemo;

public class DeviceInfo {
	
	private String deviceName;
	private int isDirectory;
	private int isOnline;
	
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int isDirectory() {
		return isDirectory;
	}
	public void setDirectory(int isDirecory) {
		this.isDirectory = isDirecory;
	}
	public int isStatus() {
		return isOnline;
	}
	public void setStatus(int isOnline) {
		this.isOnline = isOnline;
	}
}
