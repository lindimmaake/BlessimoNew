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
	private String itemName;
	
	@Column(name ="price")
	private long itemPrice;
	
	@Column(name ="description")
	private String itemDescription;
	
	@Column(name= "size")
	private long itemSize;
	
	@Column(name="image")
	private String pathToItemImage;
	
	@Column(name ="line")
	private String itemLine;
	
	protected Product()
	{
		
	}
	public long getId()
	{
		return id;	
	}
	public void setId(long id)
	{
		this.id = id;
		
	}
	public String getItemName()
	{
		return itemName;
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public String getItemDescription()
	{
		return itemDescription;
	}
	
	public void setItemDescription(String itemDescription )
	{
		this.itemDescription = itemDescription;
	}
	
	public void setItemPrice(long itemPrice)
	{
			this.itemPrice= itemPrice;
	}
	public long getItemPrice()
	{
		return itemPrice;
	}
	public void setPathToImage(String pathToItemImage)
	{
		this.pathToItemImage = pathToItemImage;
		
	}
	public long getItemSize()
	{
		return itemSize;
	}
	public void setItemSize(long itemSize)
	{
		this.itemSize = itemSize;
	}
	public String getPathToImage()
	{
		return pathToItemImage;
		
	}
	
	public String getItemLine()
	{
		return itemLine;
		
	}
	public void setItemLine(String itemLine)
	{
		this.itemLine = itemLine;
		
	}
	@Override
	public String toString() {
		return String.format("Product[id=%d, itemName='%s', itemDescription='%s',pathToItemImage='%s', itemSize='%d', itemPrice ='%d'  ]", id, itemName, itemDescription,pathToItemImage, itemSize, itemPrice);
	}
	public Product(String itemName,String itemDescription, String itemLine, String pathToItemImage, long itemSize,long itemPrice)
	{
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemLine = itemLine;
		this.pathToItemImage =pathToItemImage;
		this.itemSize = itemSize;
		this.itemPrice= itemPrice;
		
	}
}