package 工厂方法;
//普通工厂模式
public class AnimalFactory1 {
	public Animal createAnimal(String animal) {
		Animal tempAnimal =null;
		if ("Dog".equals(animal)) {
			tempAnimal = new Dog();
		} else if ("Dog".equals(animal)) {
			tempAnimal = new Cat();
		}
		return tempAnimal;
	}
}
