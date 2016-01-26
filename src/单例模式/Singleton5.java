package 单例模式;
//枚举
//不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
public enum Singleton5 {
	INSTANCE;
	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}

	public void method3() {
		System.out.println("method3");
	}
}
