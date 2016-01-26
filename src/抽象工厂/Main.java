package 抽象工厂;

public class Main {

	public static void main(String[] args) {
//		Create create =new CatFactory();
//		Animal animal = create.createAnimal();
//		animal.name();
		
		Create create =new DogFactory();
		Animal animal = create.createAnimal();
		animal.name();
	}

}
