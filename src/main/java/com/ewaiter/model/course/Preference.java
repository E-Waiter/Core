package com.ewaiter.model.course;

import javax.persistence.Column;

import com.ewaiter.model.BaseModel;

public class Preference extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5851794498225980157L;
	
	@Column(unique = true)
	private String name;
}
