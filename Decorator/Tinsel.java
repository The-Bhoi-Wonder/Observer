package Decorator;

public class Tinsel extends TreeDecorator {
private ChristmasTree tree; //the tree the star will be added to

public Tinsel(ChristmasTree tree) {//default constructor
	this.tree = tree;
}
	@Override
	public String toString() {//appends description
		String temp = this.description;
		temp = tree.toString() + " + tinsel all around";
		return temp;
	}

	@Override
	public double getCost() {//adds cost of the item to the tree
		return tree.getCost() + 2;
	}

}
