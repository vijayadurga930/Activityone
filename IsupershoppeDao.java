package com.cg.product.Dao;

import java.util.HashMap;

import com.cg.product.bean.Product;
import com.cg.product.bean.Supplier;

public interface IsupershoppeDao {

	public int addProduct(Product product);

  public int addSupplied(Supplier sup);

	public HashMap<Integer, Product> getAllProducts();

	 public HashMap<Integer, Supplier> getAllSuppliers();

}
