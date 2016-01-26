package 工厂方法;
//静态工厂方法模式
public class AnimalFactory3 {
	public static Animal createDog(){
		return new Dog();
	}
	public static Animal createCat(){
		return new Cat();
	}
}
