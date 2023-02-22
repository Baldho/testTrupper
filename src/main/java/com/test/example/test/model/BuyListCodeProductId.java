package com.test.example.test.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BuyListCodeProductId implements Serializable {

	/**
	 * Serial Version.
	 */
	private static final long serialVersionUID = -5016734162514914267L;

	private Integer buyListId;

	private String productCode;

	public BuyListCodeProductId(Integer buyListId, String productCode) {
		super();
		this.buyListId = buyListId;
		this.productCode = productCode;
	}

	public Integer getBuyListId() {
		return buyListId;
	}

	public void setBuyListId(Integer buyListId) {
		this.buyListId = buyListId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
