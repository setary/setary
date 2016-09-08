package com.kedacom.platform2mc.struct;

import java.io.Serializable;

public class DeviceGroupPathItem implements Serializable {
	public String getGroupID() {
		return groupId;
	}

	public void setGroupID(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return name;
	}

	public void setGroupName(String name) {
		this.name = name;
	}

	public String groupId;	// 组的ID.
	public String name;		// 组的名字.
}
