package Decorator;

public class RealChristmasTree extends ChristmasTree {

	public double getCost() {
		double COST = 40;//cost of a real tree
		
		return COST;
	}
	
	public RealChristmasTree() {//default constructor for a real tree
		this.description = "Real Fir Christmas Tree";
	}
	

}
