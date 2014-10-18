package com.ewaiter.model.course;

public enum CourseStatus {
	OnSale(""),
	SoldOut(""),
	Promotion(""),
	;
	
	private CourseStatus(String description) {
		this.description = description;
	}
	
	private String description = "";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
