package starbuzzcoffee;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+ 0.10;
	}

}
