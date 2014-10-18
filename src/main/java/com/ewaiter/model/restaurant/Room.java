package com.ewaiter.model.restaurant;

import java.util.Set;

import com.ewaiter.model.BaseModel;

public class Room extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3417390700900175055L;
	
	private String name;
	private RoomStatus status;
	private Set<Table> tables;
}
