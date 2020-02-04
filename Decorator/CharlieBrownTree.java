package Decorator;

public class CharlieBrownTree extends ChristmasTree {

	public double getCost() {
		double COST = 5;//cost of this tree
		
		return COST;
	}
	
	public CharlieBrownTree() {//default constructor for a charlie brown tree
		this.description = "Charlie Brown's Christmas Tree";
	}
	

}
