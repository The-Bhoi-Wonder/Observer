package Factory;

public class GroceryStore {

	/**
	 * Creates a cereal and calls the prepare, boxCereal, and cerealPrice methods
	 * @param type the type of cereal to be created
	 * @return a new cereal object
	 */
	public Cereal orderCereal(String type) {
		Cereal cereal = createCereal(type);
		
		cereal.prepare();
		cereal.boxCereal();
		cereal.priceCereal();
		return cereal;
	}
	
	/**
	 * The private method to create the cereal
	 * @param type the name of the cereal to be made
	 * @return a cereal object
	 */
	private Cereal createCereal(String type) {
		if (type.equalsIgnoreCase("lucky charms")) return new LuckyCharms();
		else if (type.equalsIgnoreCase("fruit loops")) return new FruitLoops();
		else if (type.equalsIgnoreCase("frosted flakes")) return new FrostedFlakes();
		return null;
	}
}
