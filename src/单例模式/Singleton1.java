package 单例模式;

//懒汉式
public class Singleton1 implements java.io.Serializable {
	private static final long serialVersionUID = 3976670536567220677L;
	private static Singleton1 instance = null;

	private Singleton1() {
	}

	// public Singleton1 newInstance() {
	// if (instance == null) {
	// instance = new Singleton1();
	// }
	// return instance;
	// }
	// 线程安全的懒汉式
	public synchronized Singleton1 newInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

	private Object readResolve() {
		return instance;
	}
}
