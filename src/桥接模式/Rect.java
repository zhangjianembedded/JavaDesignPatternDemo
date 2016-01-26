package 桥接模式;

public class Rect extends Shape{

	public Rect(IColor iColor) {
		super(iColor);
	}

	@Override
	public void showInfo() {
		System.out.print("这是一个Rect:");
		iColor.paintColor();
	}

}
