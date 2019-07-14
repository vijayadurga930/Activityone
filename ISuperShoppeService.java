package com.cg.product.service;

import java.util.HashMap;

import com.cg.product.bean.Product;
import com.cg.product.bean.Supplier;

public interface ISuperShoppeService {
   public int addProduct(Product product);
   public int addSupplied(Supplier sup);
   public HashMap<Integer,Product>getAllProducts();
   public HashMap<Integer,Supplier>getAllSuppliers();
   
}
