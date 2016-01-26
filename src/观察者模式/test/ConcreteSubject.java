package 观察者模式.test;

import java.util.Vector;

public class ConcreteSubject implements Observable {
	private String state = "init";
	private String date = "1970-01-01";

	private boolean changed = false;
	private Vector<Observer> obs;

	public ConcreteSubject() {
		obs = new Vector<>();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
		setChanged();
//		notifyObservers();
		notifyObservers("推送的时间呦！");
	}

	public synchronized void addObserver(Observer o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	public synchronized void deleteObserver(Observer o) {
		obs.removeElement(o);
	}

	public void notifyObservers() {
		notifyObservers(null);
	}

	public void notifyObservers(Object arg) {

		Object[] arrLocal;

		synchronized (this) {

			if (!changed)
				return;
			arrLocal = obs.toArray();
			clearChanged();
		}

		for (int i = arrLocal.length - 1; i >= 0; i--)
			((Observer) arrLocal[i]).update(this, arg);
	}

	public synchronized void deleteObservers() {
		obs.removeAllElements();
	}

	public synchronized void setChanged() {
		changed = true;
	}

	public synchronized void clearChanged() {
		changed = false;
	}

	public synchronized boolean hasChanged() {
		return changed;
	}

	public synchronized int countObservers() {
		return obs.size();
	}

}
