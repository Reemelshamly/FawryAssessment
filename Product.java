package FawryAssesment;

public abstract class Product {
private String name;
private double price;
private int quantity;

public Product(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

public String getName() {
	return name;
}

public double getPrice() {
	return price;
}

public int getQuantity() {
	return quantity;
}

public void decreaseQuantity(int amount) { this.quantity -= amount; }
public boolean isExpired() { return false; }
//public boolean requiresShipping() { return this instanceof ship; }

}
