package 享元模式.单纯享元模式;

public class Main {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight flyweight = factory.factory(new Character('a'));
		flyweight.operation("operation one");

		flyweight = factory.factory(new Character('b'));
		flyweight.operation("operation two");

		flyweight = factory.factory(new Character('a'));
		flyweight.operation("operation three");
	}

}
