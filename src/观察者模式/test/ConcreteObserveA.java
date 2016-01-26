package 观察者模式.test;

public class ConcreteObserveA implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof ConcreteSubject) {
			if (arg!=null) {
				System.out.println("B---------->" + arg.toString());	
			}else{
				ConcreteSubject concreteSubject = (ConcreteSubject) o;
				System.out.println("A---------->"+concreteSubject.getDate() + ":"
						+ concreteSubject.getState());
			}
		
		} 
	}

}
