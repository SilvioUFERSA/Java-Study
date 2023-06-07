package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public final class UsedProduct extends Product {
	
	private LocalDate manufactured;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactured) {
		super(name, price);
		this.manufactured = manufactured;
	}

	public LocalDate getManufactured() {
		return this.manufactured;
	}

	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}
	
	@Override
	public final String priceTag () {
		return getName() + "(used) $ " + getPrice() + "(Manufacture date: " + manufactured.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " )";
	}
	
}
