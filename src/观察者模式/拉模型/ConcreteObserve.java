package 观察者模式.拉模型;

public class ConcreteObserve implements Observe {

	@Override
	public void updte(Subject subject) {
		if (subject instanceof ConcreteSubject) {
			ConcreteSubject concreteSubject = (ConcreteSubject) subject;
			System.out.println(concreteSubject.getDate() + ":"
					+ concreteSubject.getState());
		}
	}

}
