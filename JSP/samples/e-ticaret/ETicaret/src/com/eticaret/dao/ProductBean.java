package com.eticaret.dao;

import java.sql.SQLException;
import java.util.List;

public class ProductBean extends BaseBean {

	private String img;
	private int categoryId;
	private double fiyat;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public ProductBean() {

	}

	public ProductBean(int productId, int categoryId, String productName,
			String img, double fiyat) {
		super(productId, productName);
		this.img = img;
		this.categoryId = categoryId;
		this.fiyat = fiyat;
	}

	@Override
	public String getMenuHtml() throws SQLException, ClassNotFoundException {
		List<ProductBean> list = EticaretDao.getProducts(this.categoryId);

		StringBuilder sb = new StringBuilder();

		if (list.size() == 0)
			return "";

		sb.append("<table data-role=\"table\" id=\"table-custom-2\" data-mode=\"columntoggle\" class=\"ui-body-d ui-shadow table-stripe ui-responsive\" data-column-btn-theme=\"b\" data-column-btn-text=\"...\" data-column-popup-theme=\"a\">");

		sb.append("<thead>");
		sb.append("<tr class=\"ui-bar-d\">");
		sb.append("<th data-priority=\"2\">Kod</th>");
		sb.append("<th data-priority=\"1\">Resim</th>");
		sb.append("<th>Ürün Adý</th>");
		sb.append("<th data-priority=\"4\">Fiyat</th>");
		sb.append("<th></th>");

		sb.append("</tr>");
		sb.append("</thead>");

		for (ProductBean pr : list) {
			sb.append("<tr>");
			sb.append("<th>" + pr.id + "</th>");
			sb.append("<td><img width=\"50px\" src=\"images/" + pr.img
					+ "\" /></td>");
			sb.append("<td>" + pr.name + "</td>");
			sb.append("<td>" + pr.fiyat + "</td>");
			sb.append("<td><a href=\"#\" onClick=\"sepeteEkle('" + pr.id
					+ "');\"><img Id=\"img" + pr.id
					+ "\" width=\"24px\" src=\"images/basket.png\"></a></td>");
			sb.append("</tr>");
		}
		sb.append("</tbody></table>");

		menuHtml = sb.toString();

		return menuHtml;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
