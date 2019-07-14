package com.cg.product.Dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.product.bean.Product;
import com.cg.product.bean.Supplier;
import com.cg.product.utility.productDB;

public class SupershoppeDaoImpl implements IsupershoppeDao {

	public static void main(String[] args) {
		
	}

	@Override
	public int addProduct(Product product) {
		Map<Integer,Product> map= productDB.getProducts();
		double randomNumber=Math.random()*1000;
		int generatedId=(int)randomNumber;
	return generatedId;
	}

	@Override
	public int addSupplied(Supplier sup) {
		
		return productDB.addSupplied(sup);
	}
    @Override
	public HashMap<Integer, Product> getAllProducts() {
	
		return (HashMap<Integer,Product>) productDB.getAllProducts();
	}

	@Override
	public HashMap<Integer,Supplier> getAllSuppliers()
	{
		return (HashMap<Integer, Supplier>) productDB.getAllSuppliers();
	}

}
