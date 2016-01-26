package 装饰模式;

public class WriteHorse implements Horse {
	private Horse horse;

	public WriteHorse() {
	}

	public WriteHorse(Horse horse) {
		this.horse = horse;
	}

	@Override
	public void name() {
		if (horse!=null) {
			horse.name();
		}
		color();
	}

	public void color() {
		System.out.println("这是一匹白马");
	}
}
