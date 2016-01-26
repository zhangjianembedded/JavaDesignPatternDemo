package 观察者模式.test;

public class ConcreteObserveB implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof ConcreteSubject) {
			if (arg != null) {
				System.out.println("B---------->" + arg.toString());
			} else {
				ConcreteSubject concreteSubject = (ConcreteSubject) o;
				System.out.println("B---------->" + concreteSubject.getDate()
						+ ":" + concreteSubject.getState());
			}
		}
	}

}
