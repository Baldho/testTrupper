package com.test.example.test.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Client implements Serializable {
	
	/**
	 * Serial Version.
	 */
	private static final long serialVersionUID = -4564820180553112130L;

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int idClient;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private boolean isActive;
	
	@OneToMany(mappedBy = "buyList")
	private List<BuyList> buyLists;
	

}
