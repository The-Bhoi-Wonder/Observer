package BabyObserve;

public class Dad implements Observer {

	private Subject baby;
	
	public Dad(Subject baby){
		this.baby = baby;
		baby.registerObserver(this);//links baby to the dad
	}
	
	public void update(Cry cry) {//finds action for the dad to do
		if (cry == Cry.Angry) {
			System.out.println("Dad puts in earplugs");
		}
		else if (cry == Cry.Hungry) {
			System.out.println("Dad feeds baby");
		}
		else if (cry == Cry.Wet) {
			System.out.println("Dad calls mom");
		}
		else System.out.println("No action found");
	}
	
}
