package Factory;

public class LuckyCharms extends Cereal {

	/**
	 * Constructor for the LuckyCharms
	 */
	public LuckyCharms() {
		super.name = "Lucky Charms";
		super.price = 1.55;
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
				"    - Create marshmellow shapes\r\n" + 
				"\r\n" + 
				"    - Mix circles and marshmellows");
	}
}
