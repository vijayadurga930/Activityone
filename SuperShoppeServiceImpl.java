package com.cg.product.service;

import java.util.HashMap;

import com.cg.product.Dao.IsupershoppeDao;
import com.cg.product.Dao.SupershoppeDaoImpl;
import com.cg.product.bean.Product;
import com.cg.product.bean.Supplier;

public class SuperShoppeServiceImpl implements ISuperShoppeService {
	IsupershoppeDao productDao=(IsupershoppeDao) new SupershoppeDaoImpl();



	@Override
	public int addProduct(Product product) {
		return productDao.addProduct(product);
	}
    @Override
	public int addSupplied(Supplier sup) {
		return productDao.addSupplied(sup);
	}
	@Override
	public HashMap<Integer, Product> getAllProducts() {
		
		return productDao.getAllProducts();
	}

	@Override
	public HashMap<Integer, Supplier> getAllSuppliers() {
		
		return productDao.getAllSuppliers();
	}
}
	