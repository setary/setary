package com.kedacom.platform2mc.struct;

import java.io.Serializable;

public class DeviceTree implements Serializable {
	public String getTreeID() {
		return treeId;
	}

	public void setTreeID(String treeId) {
		this.treeId = treeId;
	}
	public String getTreeName() {
		return name;
	}
	public void setTreeName(String name) {
		this.name = name;
	}
	public String getTreeVersion() {
		return name;
	}
	public void setTreeVersion(String version) {
		this.version = version;
	}
	public String getRootId() {
		return rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

	public String treeId;	//设备树ID
	public String name;//设备树名
	public String version;//设备树的数据版本号
	public String rootId;	//该设备树的根组ID号
}
