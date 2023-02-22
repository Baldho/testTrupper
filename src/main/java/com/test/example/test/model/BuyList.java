package com.test.example.test.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class BuyList implements Serializable {
	
	/**
	 * Serial version.
	 */
	private static final long serialVersionUID = 256314611515020551L;

	@Id
	@Column(name = "idListaCompra")
	private int idList;
	
	@Column(nullable = false, name = "customer_id")
	private int customerId;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private Date registerDate;
	
	@Column
	private Date lastUpdatedDate;
	
	@Column
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name = "client")
	private Client client;
	
	@OneToMany
	@JoinColumn(name = "buyListDetail")
	private List<BuyListDetail> buyListDetail;

}
