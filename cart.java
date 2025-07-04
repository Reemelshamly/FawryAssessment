package FawryAssesment;

import java.util.ArrayList;

public class cart {
	 private ArrayList<items> item = new ArrayList<>();
	 
	 public void add(Product product, int quantity) {
	        if (quantity > product.getQuantity()) {
	            System.out.println("Not enough stock for: " + product.getName());
	            return;
	        }
	        item.add(new items(product, quantity));
	    }
	 
	 public ArrayList<items> getItems() { 
		 return item; 
  }
	 public boolean isEmpty() {
		 return item.isEmpty(); 
}
	 public double getSubtotal() {
		    double total = 0;
		    for (items Item : item) {
		        total += Item.getTotalPrice();
		    }
		    return total;
		} 
	 public ArrayList<ship> getShippableItems() {
	        ArrayList<ship> List = new ArrayList<>();
	        for (items Item : item) {
	            if (Item.getProduct() instanceof ship) {
	                for (int i = 0; i < Item.getQuantity(); i++) {
	                    List.add((ship) Item.getProduct());
	                }
	            }
	        }
	        return List;
	    }
	 public double getShippingFees() {
		    double totalWeight = 0;
		    ArrayList<ship> shippableItems = getShippableItems();
		    for (ship item : shippableItems) {
		        totalWeight += item.getWeight();
		    }
		    return totalWeight * 30;
		   
	
	 
	 
}}