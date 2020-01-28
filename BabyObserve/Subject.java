package BabyObserve;
/*
 * Written by Joseph Bhoi
 */
public interface Subject {
	public void registerObserver(Observer observer);//adds an observer

	public void removeObserver(Observer observer);//removes an observer
	
	public void notifyObservers();
}
