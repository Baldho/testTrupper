package com.test.example.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {
	
	/**
	 * Serial Version.
	 */
	private static final long serialVersionUID = 2143392397877734821L;

	@Id
	private int idProduct;
	
	@Column
	private String code;
	
	@Column
	private String description;
	
	@Column
	private boolean isActive;

}
