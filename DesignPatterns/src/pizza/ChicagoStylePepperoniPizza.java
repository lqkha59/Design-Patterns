package pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		name ="Chicago Style Deep Dish Pepper Pizza";
		dough="Extra Thick Crust Dough";
		sauce ="Plum Tomato Sauce";
		toppings.add("Chicago Style Pepper");
	}
	
	@Override
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
