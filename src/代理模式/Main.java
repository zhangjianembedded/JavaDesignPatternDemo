package 代理模式;

public class Main {
	public static void main(String[] args) {
		IA dog =new Dog();
		IA dogProxy = new DogProxy(dog);
		dogProxy.speak();
		dogProxy.eat();
 
	}
}
