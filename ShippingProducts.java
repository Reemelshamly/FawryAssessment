package FawryAssesment;

public class ShippingProducts extends Product implements ship{
	
	  private double weight;

	    public ShippingProducts(String name, double price, int quantity, double weight) {
	        super(name, price, quantity);
	        this.weight = weight;
	    }

	    @Override
	    public double getWeight() { return weight; }

}
