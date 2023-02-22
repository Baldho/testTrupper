package com.test.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.example.test.dto.ClientBuyListDTO;
import com.test.example.test.model.BuyList;
import com.test.example.test.service.BuyListService;

import lombok.AllArgsConstructor;

@Controller(value = "/buyList")
@AllArgsConstructor
public class BuyListController {
	
	/**
	 * BuyList Service.
	 */
	private BuyListService buyListService;
	
	@GetMapping(value = "/get", params = "{idClient}")
	public ResponseEntity<List<BuyList>> get(@PathVariable Integer idClient) throws Exception {
		List<BuyList> buyList = new ArrayList<BuyList>();
		if(idClient == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();			
		}
		try {
			buyList = buyListService.getByClient(idClient);
			return ResponseEntity.ok(buyList);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	//TODO Refactor to use a DTO.
	@PostMapping(value = "/save")
	public ResponseEntity<BuyList> save(ClientBuyListDTO clientBuyListDTO){
		if(clientBuyListDTO == null) {
			ResponseEntity.badRequest().build();
		}
		try {
			buyListService.save(clientBuyListDTO);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
