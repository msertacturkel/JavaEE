import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.csystem.hiber.Product;
import org.csystem.hiber.ProductDAO;

@ManagedBean
@SessionScoped
public class ProductBean {

	private Product product;

	private List<Product> products;

	public ProductBean(){
		products=new ArrayList<Product>();
		ProductDAO pDao=new ProductDAO();
		products=pDao.findAll();
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
