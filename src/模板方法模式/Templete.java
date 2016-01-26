package 模板方法模式;

public abstract class Templete {
	private void before() {
		System.out.println("common Berore");
	}

	protected abstract void func();

	private void adter() {
		System.out.println("common after");
	}

	public void doWork() {
		before();
		func();
		adter();
	}
}
