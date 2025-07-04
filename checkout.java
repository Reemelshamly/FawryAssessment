package FawryAssesment;

import java.util.ArrayList;

public class checkout {
	private shipmentservice shippingService;
	public checkout() {
        this.shippingService = new shipmentservice();
    }

	    public void Checkout(Customer customer, cart cart) {
	        if (cart.isEmpty()) {
	            System.out.println("Cart is empty.");
	      return;
	        }

	        for (items Item : cart.getItems()) {
	            if (Item.getProduct().isExpired()) {
	                System.out.println("Product expired: " + Item.getProduct().getName());
	          return;
	          }
	            if (Item.getQuantity() > Item.getProduct().getQuantity()) {
	                System.out.println("Not enough stock for: " + Item.getProduct().getName());
	          return;
	          }
	        }

	        double subtotal = cart.getSubtotal();
	        double shipping = cart.getShippingFees();
	        double total = subtotal + shipping;

	        if (customer.getBalance() < total) {
	        	System.out.println("Insufficient balance");
	            return;
	        }

	        for (items Item : cart.getItems()) {
	            Item.getProduct().decreaseQuantity(Item.getQuantity());
	        }

	        customer.withdraw(total);

	        ArrayList<ship> itemsToShip = cart.getShippableItems();
	        if (!itemsToShip.isEmpty()) {
	            shippingService.ship(itemsToShip);
	        }


	        System.out.println("** Checkout receipt **");
	        for (items Item : cart.getItems()) {
	            System.out.printf("%dx %s %.0f\n", Item.getQuantity(), Item.getProduct().getName(), Item.getTotalPrice());
	        }
	        System.out.println("----------------------");
	        System.out.printf("Subtotal %.0f\n", subtotal);
	        System.out.printf("Shipping %.0f\n", shipping);
	        System.out.printf("Amount %.0f\n", total);
	        System.out.printf("Customer Balance %.0f\n", customer.getBalance());
	    }
}
