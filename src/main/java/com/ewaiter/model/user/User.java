package com.ewaiter.model.user;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.ewaiter.model.BaseModel;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "users")
public class User extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4049588549936176954L;
	
	private String cell;
	private String name;
	private String password;
	private String email;
}
