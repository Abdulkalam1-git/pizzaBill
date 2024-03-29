
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza basePizza = new Pizza(true);
//		basePizza.addExtraToppings();
//		basePizza.addExtraCheese();
//		basePizza.addExtraToppings();
//		basePizza.addExtraCheese();
//		
		basePizza.getBill();
		// Pizza basic = new Pizza(true;)
		DeluxPizza dp = new DeluxPizza(true);
//		dp.addExtraCheese();
//	    dp.addExtraToppings();
//	    dp.takeAway();
		dp.getBill();

	}

}
