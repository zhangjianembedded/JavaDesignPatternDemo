package 代理模式;

public class DogProxy implements IA{
	private IA dog;
	public DogProxy(IA dog) {
		this.dog =dog;
	}
 
	@Override
	public void speak() {
		System.out.println("pre speak");
		if (dog!=null) {
			dog.speak();
		}
		System.out.println("after speak");
	}

	@Override
	public void eat() {
		System.out.println("pre eat");
		if (dog!=null) {
			dog.eat();
		}
		System.out.println("after eat");
		
	}
	
}
