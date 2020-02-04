package Decorator;

public class Star extends TreeDecorator {
private ChristmasTree tree; //the tree the star will be added to

public Star(ChristmasTree tree) {//default constructor
	this.tree = tree;
}
	@Override
	public String toString() {//appends description
		String temp = this.description;
		temp = tree.toString() + " + a star on top";
		return temp;
	}

	@Override
	public double getCost() {//adds cost of the item to the tree
		return tree.getCost() + 6;
	}

}
