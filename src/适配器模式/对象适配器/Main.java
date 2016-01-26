package 适配器模式.对象适配器;

public class Main {

	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.method1();

		IEx adapter2 = new ExAdapter(adapter);
		adapter2.method1();
		adapter2.method2();
	}

}
