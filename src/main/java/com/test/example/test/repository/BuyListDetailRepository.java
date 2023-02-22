package com.test.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.test.model.BuyListDetail;

public interface BuyListDetailRepository extends JpaRepository<BuyListDetail, Integer> {
	
	List<BuyListDetail> findByCustomerId(Integer customerId);

}
