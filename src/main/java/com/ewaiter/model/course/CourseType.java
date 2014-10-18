package com.ewaiter.model.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ewaiter.model.BaseModel;

@Entity
@Table
public class CourseType extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3937759111178174448L;

	@Column(unique = true)
	private String name;
}
