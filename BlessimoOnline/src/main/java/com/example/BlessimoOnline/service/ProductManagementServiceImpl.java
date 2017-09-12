package com.example.BlessimoOnline.service;



import java.util.ArrayList;
import java.util.List;

import com.example.BlessimoOnline.model.Product;
import com.example.BlessimoOnline.repo.ProductRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagementServiceImpl implements ProductManagementService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		if (product == null)
			throw new IllegalArgumentException("Product is null");

		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		if (product == null)
			throw new IllegalArgumentException("Product is null");

		Product currentProduct = getProduct(product.getId());

		if (currentProduct == null)
			throw new IllegalArgumentException(
					"Product doesnot exist with given store id");

		BeanUtils.copyProperties(product, currentProduct);

		return productRepository.save(currentProduct);
	}

	@Override
	public Product getProduct(Long id)
	{
		if (id == null) 
			throw new IllegalArgumentException("Product Id is null");
		
		Product pr = productRepository.findOne(id);
		
		if (pr == null) throw new IllegalArgumentException("Product with given product id does not exist");
		
		return pr;
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> list = new ArrayList<>();
		
		productRepository.findAll().forEach(list::add);
		
		return list;
	}

	@Override
	public void deleteProduct(Long id) {
		if (id == null)
			throw new IllegalArgumentException("Product Id is null");

		if (getProduct(id) != null)
			productRepository.delete(id);
	}

}