package com.kedacom.platform2mc.struct;

import java.io.Serializable;

public class DeviceID implements Serializable {
	public String getSzID() {
		return szID;
	}

	public void setSzID(String szID) {
		this.szID = szID;
	}

	public String szID;
}
