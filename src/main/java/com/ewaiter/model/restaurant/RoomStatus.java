package com.ewaiter.model.restaurant;

public enum RoomStatus {
	Occpupied("有客"),
	Available("空闲"),
	Locked("已锁定"),
	Closed("暂不开放"),
	;
	private RoomStatus(String description) {
		this.description = description;
	}
	
	private String description = "";

	public String getDescription() {
		return description;
	}
}
