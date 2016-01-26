package 备忘录模式;

public class Main {

	public static void main(String[] args) {
		// 创建原始类
		Original original = new Original("aaa");
		
		// 创建备忘录
		Storage storage =new Storage(original.createMemento());
		
		System.out.println("修改前:"+original.getState());
		original.setState("bbb");
		System.out.println("修改后:"+original.getState());
		
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后:"+original.getState());
	}

}
