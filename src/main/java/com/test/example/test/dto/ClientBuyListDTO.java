package com.test.example.test.dto;

import java.io.Serializable;
import java.util.List;

import com.test.example.test.model.BuyList;

public class ClientBuyListDTO implements Serializable{

	/**
	 * Serial version.
	 */
	private static final long serialVersionUID = 8218091042256606209L;
	
	private Integer clientId;
	
	//TODO Refactor change to BuyListDTO
	private List<BuyList> buyLists;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public List<BuyList> getBuyLists() {
		return buyLists;
	}

	public void setBuyLists(List<BuyList> buyLists) {
		this.buyLists = buyLists;
	}
	
	@Override
	public String toString() {		
		return String.format("clientId: %s, buyListClient: %s", clientId, buyLists);
	}
	
}
