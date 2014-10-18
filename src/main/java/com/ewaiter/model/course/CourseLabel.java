package com.ewaiter.model.course;

import javax.persistence.Column;

import com.ewaiter.model.BaseModel;

public class CourseLabel extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3783860105365625343L;

	@Column(unique = true)
	private String name;
}
