package 观察者模式.拉模型;

public class ConcreteSubject extends Subject {
	private String state = "init";
	private String date = "1970-01-01";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.nodifyObservers();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
		this.nodifyObservers();
	}

}
