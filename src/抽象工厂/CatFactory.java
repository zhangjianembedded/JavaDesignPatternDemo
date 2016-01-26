package 抽象工厂;
//抽象工厂模式
public class CatFactory implements Create{

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
