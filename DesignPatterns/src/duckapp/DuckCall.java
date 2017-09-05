package duckapp;

public class DuckCall {
	Duck duck;
	
	public void setDuck(Duck duck) {
		this.duck = duck;
	}

	public void performDuckCall() {
//		IQuackBehavior qb = 
		duck.getQuackBehavior().quack();
//		qb.quack();
	}
}
