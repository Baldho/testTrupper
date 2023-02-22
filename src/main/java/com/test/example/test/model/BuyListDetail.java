package com.test.example.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BuyListDetail implements Serializable {
	
	/**
	 * Serial version.
	 */
	private static final long serialVersionUID = -5415444303058414106L;

	@EmbeddedId
	private BuyListCodeProductId buyListCodeProductId;
	
	@Column
	private int buyListId;
	
	@Column
	private int productCode;
	
	@Column
	private int quantity;
	
	@ManyToOne
	private int buyList;

}
