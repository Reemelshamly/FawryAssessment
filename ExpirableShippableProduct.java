package FawryAssesment;

import java.time.LocalDate;

public class ExpirableShippableProduct extends ProductExpirable implements ship {
	  private double weight;

	    public ExpirableShippableProduct(String name, double price, int quantity, LocalDate expiredDate, double weight) {
	        super(name, price, quantity, expiredDate);
	        this.weight = weight;
	    }

	    public double getWeight() { return weight; }
	}
