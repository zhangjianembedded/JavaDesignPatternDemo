package 适配器模式.对象适配器;

public class ExAdapter implements IEx {
	private Adapter adapter;

	public ExAdapter(Adapter adapter) {
		this.adapter = adapter;
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public void method1() {
		adapter.method1();
	}

}
