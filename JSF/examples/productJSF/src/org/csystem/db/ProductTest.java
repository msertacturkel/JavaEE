package org.csystem.db;

import java.util.List;

public class ProductTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductDAO pDao=new ProductDAO();
		List<Product> products = pDao.findAll();
		for (Product product : products) {
			System.out.println(product.getProductcode());
		}

		Product product = pDao.findByProductCode("S700_3167");
		System.out.println(product.getProductdescription() );
	}

}
