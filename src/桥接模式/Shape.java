package 桥接模式;

public abstract class Shape {
	protected IColor iColor;

	public Shape(IColor iColor) {
		super();
		this.iColor = iColor;
	}

	public abstract void showInfo();
}
