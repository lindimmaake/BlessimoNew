package com.example.BlessimoOnline.service;

import java.util.List;

import com.example.BlessimoOnline.model.Product;

public interface ProductManagementService {
	
	public Product addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProduct(Long id);
	public Product updateProduct(Product store);
	public void deleteProduct(Long id);
}