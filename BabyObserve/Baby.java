package BabyObserve;

import java.util.ArrayList;

public class Baby implements Subject{
	
private ArrayList<Observer> observers;
private Cry cry;

public Baby() {
	System.out.println("A baby is born");
	observers = new ArrayList<Observer>();//initiates the arraylist for use
}

@Override
public void registerObserver(Observer observer) {//override to add observer
	observers.add(observer);
}
@Override
public void removeObserver(Observer observer) {//override to remove observer
	observers.remove(observer);
}
@Override
public void notifyObservers() {//uses a for each loop to update every observer and cry
	for(Observer obs : observers) {
		obs.update(cry);
	}
}
public void angryCry() {//triggers angry cry action
	System.out.println("This baby is angry!");
	cry = Cry.Angry;
	this.notifyObservers();
}
public void hungryCry() {//triggers hungry cry action
	System.out.println("This baby is hungry");
	cry = Cry.Hungry;
	this.notifyObservers();
}
public void wetCry() {//triggers wet cry action
	System.out.println("This baby is wet");
	cry = Cry.Wet;
	this.notifyObservers();
}



}
