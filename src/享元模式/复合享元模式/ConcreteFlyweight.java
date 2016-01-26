package 享元模式.复合享元模式;

public class ConcreteFlyweight implements Flyweight {
	private Character intrinsicState = null;

	public ConcreteFlyweight(Character intrinsicState) {
		super();
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation(String state) {
		System.out.println("Intrinsic State = " + this.intrinsicState);
		System.out.println("Extrinsic State = " + state);
	}

}
