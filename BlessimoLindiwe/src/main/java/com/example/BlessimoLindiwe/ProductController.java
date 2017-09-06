package com.example.BlessimoLindiwe;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProductController 
{
	
	@Autowired
	ProductRepository repository;
	
	
	@RequestMapping(value = "/postitem", method = RequestMethod.POST)
	public void postItem(@RequestBody Product item) {
		repository.save(new Product(item.getName(),item.getPrice(),item.getDescription(),item.getSize(),item.getImage(),item.getLine()));	
	
	}

	@RequestMapping("/findall")
	public Response findAllItems() {

		Iterable<Product> items = repository.findAll();

		return new Response("Done", items);
	}
	
	@RequestMapping("/findname")
	public Response findByName(@RequestParam("name") String name)
	{

		List<Product> items = repository.findByName(name);

		return new Response("Done", items);
	}
	@RequestMapping("/product/{id}")
	public Response findItemById(@PathVariable("id") long id) {

		Product item = repository.findOne(id);

		return new Response("Done", item);
	}
	
	

}
