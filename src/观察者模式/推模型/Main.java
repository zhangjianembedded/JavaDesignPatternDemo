package 观察者模式.推模型;

public class Main {

	public static void main(String[] args) {
		Observer observer = new ConcreteObserver();
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(observer);
		subject.setState("a");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		subject.setState("b");
	}

}
