package com.cg.product.utility;

import java.util.HashMap;
import java.util.Map;

import com.cg.product.bean.Product;
import com.cg.product.bean.Supplier;

public class productDB {
	
private static Map<Integer, Product> Product = new HashMap<>();
static
{
    Product.put(101,new Product("Laptop",30000," 2 "));
	Product.put(102,new Product("Tablet",10000," 4 "));
	Product.put(103,new Product("Mobile",20000," 3 "));
}
public static Map<Integer,Product> getProducts(){
	return Product;
}
public static void setProducts(Map<Integer,Product>Products) {
	productDB.Product=Products;
}
public static Map<Integer,Product> getAllProducts() {
	
	return Product;
}
public static int  addSupplied(Supplier sup) {
	return sup;
	
}
}