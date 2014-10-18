package com.ewaiter.model.restaurant;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ewaiter.model.BaseModel;

@Entity
@Table(name = "restaurant")
public class Restaurant extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4273370532832321576L;

	private String name;
}
