package 桥接模式;

public class Circle extends Shape{

	public Circle(IColor iColor) {
		super(iColor);
	}

	@Override
	public void showInfo() {
		System.out.print("这是一个Circle:");
		iColor.paintColor();
	}

}
