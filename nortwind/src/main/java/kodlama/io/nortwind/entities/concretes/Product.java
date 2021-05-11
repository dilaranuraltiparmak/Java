package kodlama.io.nortwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="product_id")
private int id;
	
	@Column(name="category_id")
private int categoryId;
	
	@Column(name="product_name")
private String produtName;
	
	@Column(name="unit_price")
private double unitPrice;
	
	@Column(name="unit_in_stock")
private short unitInStock;
	
	@Column(name="quantity_per_unit")
private String quantityPerUnit;
	

public Product(int id, int categoryId, String produtName, double unitPrice, short unitInStock, String quantityPerUnit) {
	super();
	this.id = id;
	this.categoryId = categoryId;
	this.produtName = produtName;
	this.unitPrice = unitPrice;
	this.unitInStock = unitInStock;
	this.quantityPerUnit = quantityPerUnit;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getProdutName() {
	return produtName;
}
public void setProdutName(String produtName) {
	this.produtName = produtName;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public short getUnitInStock() {
	return unitInStock;
}
public void setUnitInStock(short unitInStock) {
	this.unitInStock = unitInStock;
}
public String getQuantityPerUnit() {
	return quantityPerUnit;
}
public void setQuantityPerUnit(String quantityPerUnit) {
	this.quantityPerUnit = quantityPerUnit;
}

}
