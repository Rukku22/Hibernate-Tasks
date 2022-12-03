package com.ecommerce;

public class ProductDetails {

	private String productName;
	private String productImageUrl;
	private String productDescript;
	private String productPrice;
	private String productCat;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public String getProductDescript() {
		return productDescript;
	}
	public void setProductDescript(String productDescript) {
		this.productDescript = productDescript;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCat() {
		return productCat;
	}
	public void setProductCat(String productCat) {
		this.productCat = productCat;
	}
	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", productImageUrl=" + productImageUrl
				+ ", productDescript=" + productDescript + ", productPrice=" + productPrice + ", productCat="
				+ productCat + "]";
	}
	
	
}

