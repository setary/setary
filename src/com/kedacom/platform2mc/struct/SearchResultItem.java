package com.kedacom.platform2mc.struct;

import java.io.Serializable;

public class SearchResultItem implements Serializable {
    public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDeviceID() {
		return deviceId;
	}
	public void setDeviceID(String deviceId) {
		this.deviceId = deviceId;
	}
	public int getVSID() {
		return vsId;
	}
	public void setVSID(int vsId) {
		this.vsId = vsId;
	}
	public String getName() {
		return szDevSrcAlias;
	}
	public void setName(String name) {
		this.szDevSrcAlias = name;
	}
	public DeviceGroupPathItem[] getGroupPath() {
		return devGroupPath;
	}
	public void setGroupPath(DeviceGroupPathItem[] groupPath) {
		this.devGroupPath = groupPath;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	
	public int getDevType() {
		return nDevType;
	}
	public void setDevType(int nDevType) {
		this.nDevType = nDevType;
	}
	public int getDevCap() {
		return nDevCap;
	}
	public void setDevCap(int nDevCap) {
		this.nDevCap = nDevCap;
	}
	public String getDomainID() {
		return domainId;
	}
	public void setDomainID(String domainId) {
		this.domainId = domainId;
	}
	public String getManufacturer() {
		return szManufacturer;
	}
	public void setManufacturer(String szManufacturer) {
		this.szManufacturer = szManufacturer;
	}
	public int type;				// ����, ����μ������������� SDK_SEARCH_RESULT_DEVICEGROUP
	public String deviceId;			// id
	public int vsId;				// ��ƵԴid. ���Ϊ�豸��/�豸ʱ������.
	public String szDevSrcAlias; 	//����	
	public DeviceGroupPathItem[] devGroupPath;	// �ϼ���.
	public boolean online;			//�Ƿ�����
	public int nDevType; 			// device type
	public int nDevCap; 			// device capability
	public String domainId;
	public String szManufacturer;
}
