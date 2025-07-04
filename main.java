package FawryAssesment;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
	    Product cheese = new ExpirableShippableProduct("Cheese", 100, 10, LocalDate.of(2025, 7, 30), 0.2);
        Product biscuits = new ExpirableShippableProduct("Biscuits", 150, 5, LocalDate.of(2025, 7, 10), 0.7);
        Product scratchCard = new Product("Scratch Card", 50, 100) {};

        Customer customer = new Customer("Reem", 1000);
        cart cart = new cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        checkout service = new checkout();
        service.Checkout(customer, cart);

	}

}
