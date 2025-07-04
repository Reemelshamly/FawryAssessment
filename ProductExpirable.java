package FawryAssesment;

import java.time.LocalDate;

public class ProductExpirable extends Product{
	private LocalDate expiredDate;
	public ProductExpirable(String name, double price, int quantity,  LocalDate expiredDate) {
		super(name, price, quantity);
		 this.expiredDate = expiredDate;
	}
	

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiredDate);
    }
}
