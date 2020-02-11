package Factory;

public class FruitLoops extends Cereal {

	/**
	 * Constructor for the Fruit Loops
	 */
	public FruitLoops() {
		super.name = "Fruit Loops";
		super.price = 1.89;
	}
	
	/**
	 * Overrides the prepare method from cereal but also calls cereal's prepare method then displays its own message
	 */
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain\r\n" + 
				"\r\n" + 
				"    - Shape into circles\r\n" + 
				"\r\n" + 
				"    - Randomly color circles\r\n" + 
				"\r\n" + 
				"    - Let circles dry");
	}
}
