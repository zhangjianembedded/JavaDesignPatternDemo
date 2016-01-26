package 工厂方法;

public class Main {
	public static void main(String[] args) {
//		AnimalFactory1 animalFactory1 = new AnimalFactory1();
//		Animal animal= animalFactory1.createAnimal("Dog");
//		animal.name();
		
//		AnimalFactory2 animalFactory2 = new AnimalFactory2();
//		Animal animal =animalFactory2.createCat();
//		animal.name();
//		animal =animalFactory2.createDog();
//		animal.name();
		
		Animal animal =AnimalFactory3.createCat();
		animal.name();
		animal =AnimalFactory3.createDog();
		animal.name();
	}
}
