package com.test.example.test.service;

import java.util.List;

import com.test.example.test.model.BuyList;

public interface BuyListService {

	List<BuyList> save(Integer customerId, List<BuyList> buyList) throws Exception;
	
	List<BuyList> getByClient(Integer client) throws Exception;
}
