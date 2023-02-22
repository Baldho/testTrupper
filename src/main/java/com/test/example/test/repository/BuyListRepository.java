package com.test.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.test.model.BuyList;
import com.test.example.test.model.BuyListDetail;

public interface BuyListRepository extends JpaRepository<BuyList, Integer>{
	
	List<BuyList> findByCustomerId(Integer customerId);

}
