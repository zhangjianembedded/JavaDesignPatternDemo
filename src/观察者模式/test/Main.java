package 观察者模式.test;

 

public class Main {

	public static void main(String[] args) {
		Observer observeA = new ConcreteObserveA();
		Observer observeB = new ConcreteObserveB();
		ConcreteSubject subject = new ConcreteSubject();
		subject.addObserver(observeA);
		subject.addObserver(observeB);
		
		subject.setDate("2016-01-15");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		subject.setState("end");
		subject.deleteObserver(observeB);
		
		subject.setState("error");

	}

}
