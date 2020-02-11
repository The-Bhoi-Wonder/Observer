package Factory;

public class FrostedFlakes extends Cereal {

	/**
	 * Constructor for the Frosted Flakes
	 */
	public FrostedFlakes() {
		super.name = "Frosted Flakes";
		super.price = 2.99;
	}
	
	/**
	 * Overrides the prepare method from cereal but also calls cereal's prepare method then displays its own message
	 */
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain\r\n" + 
				"\r\n" + 
				"    - Shape into flakes\r\n" + 
				"\r\n" + 
				"    - Sprinkle with frosting");
	}
}
