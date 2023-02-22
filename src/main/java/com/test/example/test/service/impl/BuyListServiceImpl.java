package com.test.example.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.example.test.model.BuyList;
import com.test.example.test.repository.BuyListRepository;
import com.test.example.test.service.BuyListService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuyListServiceImpl implements BuyListService {

	/**
	 * BuyListRepository.
	 */
	private BuyListRepository buyListRepository;

	public List<BuyList> save(Integer customerId, List<BuyList> buyList) throws Exception {
		List<BuyList> buyLists = new ArrayList<BuyList>();
		if (buyList == null) {
			// TODO Add log
			throw new Exception("::: The buyList should not be null");
		}
		try {
			//TODO Refactor method
			//buyLists = save(buyList);
		} catch (Exception e) {
			// TODO Add log
			throw new Exception("::: An error ocurrs with saveBuyList");
		}

		return buyLists;
	}

	/**
	 * Get the buy lists client's.
	 */
	@Override
	public List<BuyList> getByClient(Integer client) throws Exception {
		List<BuyList> buyList = new ArrayList<>();
		if (client == null) {
			throw new Exception("::: The client can't be null");
		}
		try {
			buyList = buyListRepository.findByCustomerId(client);
		} catch (Exception e) {
			throw new Exception("::: An error occur's when get the buy list.");
		}
		return buyList;
	}

}
