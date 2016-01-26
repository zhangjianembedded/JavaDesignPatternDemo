package 桥接模式;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Circle(new RedColor());
		shape.showInfo();

		shape = new Circle(new GreenColor());
		shape.showInfo();

		shape = new Rect(new RedColor());
		shape.showInfo();

		shape = new Rect(new GreenColor());
		shape.showInfo();
	}

}
