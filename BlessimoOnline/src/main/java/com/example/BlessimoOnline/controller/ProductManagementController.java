package com.example.BlessimoOnline.controller;



import com.example.BlessimoOnline.model.Product;
import com.example.BlessimoOnline.service.ProductManagementService;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductManagementController extends BaseController{

	@Autowired
	ProductManagementService productService;

	@RequestMapping(value = "/loadproduct", method = RequestMethod.GET)
	public String productLoad(Model model) {
		model.addAttribute("product", new Product());
		return "product";
	}

	
	@RequestMapping(value = "/getallproducts", method = RequestMethod.GET)
	public String getAllProduts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "productlist";
	}
	
	@RequestMapping(value = "/addprouct", method = RequestMethod.POST)
	public String productAdd(@ModelAttribute Product product, Model model) {
		Product addedProduct = productService.addProduct(product);
		model.addAttribute("products", productService.getAllProducts());
		return "productlist";
	}
	
	@RequestMapping(value = "/deleteproduct/{id}", method = RequestMethod.GET)
	public String productDelete(@PathVariable Long id, Model model) {

		productService.deleteProduct(id);
		model.addAttribute("products", productService.getAllProducts());
		return "productlist";
	}
	
	@RequestMapping(value = "/updateproduct", method = RequestMethod.POST)
	public String productUpdate(@ModelAttribute Product product, Model model) {
		productService.updateProduct(product);
		model.addAttribute("products", productService.getAllProducts());
		return "productlist";
	}
	
	@RequestMapping(value = "/editproduct/{id}", method = RequestMethod.GET)
	public String productEdit(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProduct(id));
		return "editproduct";
	}


}