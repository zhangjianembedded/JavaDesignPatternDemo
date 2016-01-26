package 观察者模式.推模型;

public class ConcreteObserver implements Observer {

	@Override
	public void update(String state) {
		System.out.println("状态为：" + state);
	}

}
