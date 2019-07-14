package com.cg.product.bean;

public class Supplier{

	private int supplierId;
	private String name;
	private String mobilenumber;
	private String address;
	public Supplier(int supplierId, String name, String mobilenumber, String address) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.address = address;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "supplier [supplierId=" + supplierId + ", name=" + name + ", mobilenumber=" + mobilenumber + ", address="
				+ address + "]";
	}
	
}
