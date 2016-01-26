package 工厂方法;
////多个工厂方法模式
public class AnimalFactory2 {
	public Animal createDog(){
		return new Dog();
	}
	public Animal createCat(){
		return new Cat();
	}
}
