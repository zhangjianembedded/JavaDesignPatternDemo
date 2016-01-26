package 适配器模式.类适配器;

public class ExAdapter extends Adapter implements IEx {

	@Override
	public void method2() {
		System.out.println("method2");
	}

}
