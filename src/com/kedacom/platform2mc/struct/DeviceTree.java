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

	public String treeId;	//�豸��ID
	public String name;//�豸����
	public String version;//�豸�������ݰ汾��
	public String rootId;	//���豸���ĸ���ID��
}
