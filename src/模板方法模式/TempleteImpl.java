package 模板方法模式;

public class TempleteImpl extends Templete {

	@Override
	protected void func() {
		System.out.println("具体实现在子类");
	}

}
