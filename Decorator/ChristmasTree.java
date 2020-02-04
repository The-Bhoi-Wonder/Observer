package Decorator;
/*
 * Written by Joseph Bhoi 02//03/2020
 */

public abstract class ChristmasTree {
	protected String description;
	
	public String toString() {//simply returns the description of the tree
		return description;
	}
	
	
	public abstract double getCost();//abstract getcost method for the trees to use
}
