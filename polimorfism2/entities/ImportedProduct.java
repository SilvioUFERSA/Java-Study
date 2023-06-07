package entities;

public final class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return this.customsFee + getPrice();
	}
	
	@Override
	public String priceTag () {
		return getName() + " $ " + totalPrice() + "(Customs fee:" + this.customsFee + " )";
	}
	
}
