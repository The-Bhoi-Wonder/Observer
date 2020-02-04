package Decorator;

public class FakeChristmasTree extends ChristmasTree {

	public double getCost() {
		double COST = 50;//cost of this tree
		
		return COST;
	}
	
	public FakeChristmasTree() {//default constructor for a fake tree
		this.description = "Artificial Christmas Tree";
	}
	

}
