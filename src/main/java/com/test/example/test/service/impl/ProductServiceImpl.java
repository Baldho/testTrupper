package com.test.example.test.service.impl;

import org.springframework.stereotype.Service;

import com.test.example.test.model.Product;
import com.test.example.test.repository.ProductRepository;
import com.test.example.test.service.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

	/**
	 * Product Repository.
	 */
	private ProductRepository productRepository;

	public Product save(Product product) throws Exception {
		Product productSaved;
		if (product == null) {
			// TODO Add log.
			throw new Exception("The product can't be null");
		}
		try {
			productSaved = productRepository.save(product);
		} catch (Exception e) {
			// TODO Add log.
			throw new Exception("An error ocurrs saving the prodcut");
		}
		return productSaved;
	}

}
