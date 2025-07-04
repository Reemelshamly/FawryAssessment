package FawryAssesment;

public class items {
	private Product product;
	private int quantity;

	    public items(Product product, int quantity) {
	        this.product = product;
	        this.quantity = quantity;
	    }

	    public Product getProduct() {
	    	return product; }
	    public int getQuantity() { 
	    	return quantity; }
	    public double getTotalPrice() {
	    	return product.getPrice() * quantity; }
}
