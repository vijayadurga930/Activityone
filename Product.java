package com.cg.product.bean;

public class Product {
	private int productId;
	private String productname;
	private double price;
	private int quantity;

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productname, double price, int quantity) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}

	
	@Override
	public String toString() {
		return "product [productId=" + productId + ", productname=" + productname + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
