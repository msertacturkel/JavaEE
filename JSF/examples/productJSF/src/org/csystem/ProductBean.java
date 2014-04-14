/**
 * 
 */
package org.csystem;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.csystem.db.Product;
import org.csystem.db.ProductDAO;

/**
 * @author Metin
 * 
 */
public class ProductBean {
	private List<SelectItem> productItems = new ArrayList<SelectItem>();
	private String productCode;
	private ProductDAO pDAO;
	private String details = "";

	public String getDetails() {
		Product product = null;
		if (productCode != null) {
			product = pDAO.findByProductCode(productCode);
			details = product.getProductdescription();
		}
		return details;

	}

	public void setDetails(String detail) {
		this.details = detail;
	}

	public ProductBean() {
		pDAO = new ProductDAO();
		List<Product> products = pDAO.findAll();
		for (Product product : products) {
			SelectItem select = new SelectItem(product.getProductcode(),
					product.getProductname());
			productItems.add(select);
		}
	}

	public List<SelectItem> getProductItems() {
		return productItems;
	}

	public void setProductItems(List<SelectItem> productItems) {
		this.productItems = productItems;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;

	}

	public String gitAction() {

		return "git";
	}

}
