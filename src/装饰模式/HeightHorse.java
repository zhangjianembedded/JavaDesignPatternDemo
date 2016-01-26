package 装饰模式;

public class HeightHorse implements Horse {
	private Horse horse;

	public HeightHorse() {
	}

	public HeightHorse(Horse horse) {
		this.horse = horse;
	}

	@Override
	public void name() {
		if (horse != null) {
			horse.name();
		}
		height();
	}

	public void height() {
		System.out.println("这是一匹1.5米高的马");
	}
}
