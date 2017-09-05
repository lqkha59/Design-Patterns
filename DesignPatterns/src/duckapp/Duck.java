package duckapp;

public abstract class Duck {
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(IFlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(IQuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public IQuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
}
