package Decorator;

public class Lights extends TreeDecorator {
private ChristmasTree tree; //the tree the star will be added to

public Lights(ChristmasTree tree) {//default constructor
	this.tree = tree;
}
	@Override
	public String toString() {//appends description
		String temp = this.description;
		temp = tree.toString() + " + strings of lights";
		return temp;
	}

	@Override
	public double getCost() {//adds cost of the item to the tree
		return tree.getCost() + 2;
	}

}
