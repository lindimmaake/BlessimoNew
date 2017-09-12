package com.example.BlessimoOnline.repo;

import com.example.BlessimoOnline.model.Product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> 
{
	List<Product> findByName(String productName);
}