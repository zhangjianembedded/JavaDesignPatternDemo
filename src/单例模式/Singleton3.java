package 单例模式;

//静态内部类
public class Singleton3 {
	private Singleton3() {
	}
	private static class SingleTonHolder {
		private static final  Singleton3 INSTANCE = new Singleton3();
	}

	public static final Singleton3 getInstance() {
		return SingleTonHolder.INSTANCE;
	}
}
