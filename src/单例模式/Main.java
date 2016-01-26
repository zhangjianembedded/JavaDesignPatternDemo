package 单例模式;

public class Main {

	public static void main(String[] args) {
		Singleton5.INSTANCE.method1();
		Singleton5.INSTANCE.method2();
		System.out.println(Singleton5.INSTANCE.hashCode());
		System.out.println(Singleton5.INSTANCE.hashCode());
	}

}
