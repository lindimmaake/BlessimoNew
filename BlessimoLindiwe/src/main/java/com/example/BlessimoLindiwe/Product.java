package com.example.BlessimoLindiwe;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable
{
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name ="price")
	private String price;
	
	@Column(name ="description")
	private String description;
	
	@Column(name= "size")
	private String size;
	
	@Column(name="image")
	private String image;
	
	@Column(name ="line")
	private String line;
	
	protected Product()
	{
		
	}
	public long getId()
	{
		return id;	
	}
//	public void setId(long id)
//	{
//		this.id = id;
//		
//	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String itemName)
	{
		this.name = itemName;
	}
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String itemDescription )
	{
		this.description = itemDescription;
	}
	
	public void setPrice(String itemPrice)
	{
			this.price= itemPrice;
	}
	public String getPrice()
	{
		return price;
	}
	public void setImage(String pathToItemImage)
	{
		this.image = pathToItemImage;
		
	}
	public String getSize()
	{
		return size;
	}
	public void setSize(String itemSize)
	{
		this.size = itemSize;
	}
	public String getImage()
	{
		return image;
		
	}
	
	public String getLine()
	{
		return line;
		
	}
	public void setLine(String itemLine)
	{
		this.line = itemLine;
		
	}
	@Override
	public String toString() {
		return String.format("Product[id=%d, name='%s',price ='%d', description='%s',size='%d',image='%s', line='%s' ]", id, name,price,description,size,image,line);
	}
	public Product(String itemName,String itemPrice ,String itemDescription,String itemSize,String pathToItemImage,String itemLine)
	{
		this.name = itemName;
		this.price= itemPrice;
		this.description = itemDescription;
		this.size = itemSize;
		this.image =pathToItemImage;
		this.line = itemLine;
		
		
		
	}
}