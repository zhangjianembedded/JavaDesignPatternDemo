package 观察者模式.拉模型;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		Observe observe = new ConcreteObserve();
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(observe);
		subject.setDate("2016-01-15");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		subject.setState("end");
		subject.detach(observe);
		
		subject.setState("error");

	}

}
