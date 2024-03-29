
public class Pizza {
	private int price;
	private Boolean veg;

	private int extraCheesePrice = 100;
	private int extraToppingAdded = 150;
	private int backPack = 20;

	private int basePizzaprice;

	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded = false;
	private boolean isOptForTakeAway = false;

	public Pizza(Boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaprice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		System.out.println("Extra cheese added");
		this.price += extraCheesePrice;
	}

	public void addExtraToppings() {
		isExtraToppingAdded = true;
		System.out.println("extra toppings ");
		this.price += extraToppingAdded;
	}

	public void takeAway() {
		isOptForTakeAway = true;
		System.out.println("take away opted");
		this.price += backPack;

	}

	public void getBill() {
		String bill = "";
		System.out.println("pizza :" + basePizzaprice);
		if (isExtraCheeseAdded) {
			bill += "Extra cheese added : " + extraCheesePrice + "\n";

		}
		if (isExtraToppingAdded) {
			bill += "take away:" + backPack + "\n";
		}
		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);
	}

}
