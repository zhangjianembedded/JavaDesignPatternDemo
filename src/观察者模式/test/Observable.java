package 观察者模式.test;

public interface Observable {

	void addObserver(Observer o);

	void deleteObserver(Observer o);

	void notifyObservers();

	void notifyObservers(Object arg);

	void deleteObservers();

	void setChanged();

	void clearChanged();

	boolean hasChanged();

	int countObservers();

}
