package 备忘录模式;

public class Original {
	private String state;

	public Original(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento(){
		return new Memento(this.state);
	}

	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}
}
