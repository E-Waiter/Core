package com.ewaiter.model.course;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.ewaiter.model.BaseModel;

public class Course extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5421686188466846833L;
	
	@Column(unique = true)
	private String name;
	
	@OneToOne
	@Cascade(value = {CascadeType.SAVE_UPDATE})
	private CourseType type;
	
	private double price;
	
	private CourseStatus status = CourseStatus.OnSale;
	
	@OneToMany
	private Set<CourseLabel> labels;
	
	@OneToMany
	private Set<Preference> preferences;
}
