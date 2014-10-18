package com.ewaiter.model.restaurant;

import com.ewaiter.model.BaseModel;

public class Table extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4718862776700075249L;
	
	private String name;
	private int capacity;
	private TableStatus status;
	private Room room;
}
