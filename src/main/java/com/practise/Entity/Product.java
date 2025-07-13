package com.practise.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_Details")
public class Product {
	@Id
	private int ProductId;
	
	@Column(name = "ProductName")
	private String ProductName;
	
	private int ProductPrice;
	
    private String ProductMadeIn;
    
    private String ProductBrand;

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductMadeIn() {
		return ProductMadeIn;
	}

	public void setProductMadeIn(String productMadeIn) {
		ProductMadeIn = productMadeIn;
	}

	public String getProductBrand() {
		return ProductBrand;
	}

	public void setProductBrand(String productBrand) {
		ProductBrand = productBrand;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ ", ProductMadeIn=" + ProductMadeIn + ", ProductBrand=" + ProductBrand + "]";
	}

	
    
    
}
