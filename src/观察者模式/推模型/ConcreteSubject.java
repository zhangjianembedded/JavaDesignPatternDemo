package 观察者模式.推模型;

public class ConcreteSubject extends Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("主题状态为：" + state);
		this.nodifyObservers(state);
	}

}
