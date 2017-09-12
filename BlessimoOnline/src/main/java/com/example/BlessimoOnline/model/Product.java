package com.example.BlessimoOnline.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable {

	//@Id
	//@GeneratedValue(generator="PRODUCT_SEQ")
	//@SequenceGenerator(name="PRODUCT_SEQ",sequenceName="PRODUCT_SEQ", allocationSize=1)
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	///private long id;
	Long id;
	
	@Column(name="name")
	String name;
	
	@Column(name ="line")
	String line;
	
	@Column(name ="price")
	String price;
	
	@Column(name="image")
	String image;

	public Long getId() {
		return id;
	}

	public void setId(Long productId) {
		this.id = productId;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String productName) {
		this.name = productName;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String productLine) {
		this.line = productLine;
	}

	
	public String getPrice() {
		return price;
	}

	public void setPrice(String productPrice) {
		this.price = productPrice;
	}

	public String getImage() {
		return image;
	}

	public void setProductImage(String productImage) {
		this.image = productImage;
	}
	public Product()
	{
		
	}

}