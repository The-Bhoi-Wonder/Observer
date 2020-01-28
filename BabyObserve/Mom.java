package BabyObserve;

public class Mom implements Observer {

	private Subject baby;
	
	public Mom(Subject baby){//links baby to the mom
		this.baby=baby;
		baby.registerObserver(this);
	}
	
	public void update(Cry cry) {//finds action for the mom to do
		if (cry == Cry.Angry) {
			System.out.println("Mom hugs and rocks baby, maybe spoiling");
		}
		else if (cry == Cry.Hungry) {
			System.out.println("Mom cuddles and feeds baby");
		}
		else if (cry == Cry.Wet) {
			System.out.println("Mom changes baby");
		}
		else System.out.println("No action found");
		System.out.println();//adds extra line so it looks nice
	}
	
}
