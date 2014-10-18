package com.ewaiter.model.order;

import java.util.Set;

import com.ewaiter.model.BaseModel;
import com.ewaiter.model.course.Course;
import com.ewaiter.model.course.Preference;

public class Serve extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5255308649558583316L;
	
	private Course course;

	private int amount;
	
	private Set<Preference> preferences;
}
