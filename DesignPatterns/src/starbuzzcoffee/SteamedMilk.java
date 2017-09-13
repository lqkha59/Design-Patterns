package starbuzzcoffee;

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Stemed Milk";
	}

	@Override
	public double cost() {
		return beverage.cost()+ 0.10;
	}

}
