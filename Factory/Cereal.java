package Factory;

public abstract class Cereal {
	protected String name;
	protected double price;
	
	/**
	 * Prints out "Preparing the "
	 */
	public void prepare() {
		System.out.println("Preparing the " + name);
	}
	
	/**
	 * Displays the first boxing output
	 */
	public void boxCereal() {
		System.out.println("Putting fun pictures of " + name + " on a box\nPouring the " + name + " into the box");
	}
	
	/**
	 * Displays the price of the cereal
	 */
	public void priceCereal() {
		System.out.println("Putting the price tag of $" + price + " on the " + name + " box");
	}

}
