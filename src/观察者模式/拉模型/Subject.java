package 观察者模式.拉模型;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observe> list = new ArrayList<Observe>();

	public void attach(Observe observe) {
		list.add(observe);
		System.out.println("attached observe");
	}

	public void detach(Observe observe) {
		list.remove(observe);
		System.out.println("detached observe");
	}

	public void nodifyObservers() {
		for (Observe observe : list) {
			observe.updte(this);
		}
	}
}
