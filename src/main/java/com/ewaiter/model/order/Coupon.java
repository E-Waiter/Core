package com.ewaiter.model.order;

import java.util.Set;

import javax.persistence.OneToMany;

import com.ewaiter.model.BaseModel;

public class Coupon extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5553775814445822057L;
	
	private boolean isPercentage = false;
	
	private double amount;
	
	@OneToMany
	private Set<Condition> conditions;
}
