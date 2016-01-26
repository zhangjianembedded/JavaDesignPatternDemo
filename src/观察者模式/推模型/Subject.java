package 观察者模式.推模型;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> list = new ArrayList<>();

	public void attach(Observer observer) {
		list.add(observer);
		System.out.println("Attached an observer");
	}

	public void detach(Observer observer) {
		list.remove(observer);
		System.out.println("Detached an observer");
	}

	public void nodifyObservers(String newState) {
		for (Observer observer : list) {
			observer.update(newState);
		}
	}
}
