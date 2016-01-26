package 组合模式;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("This is leaf,can not add");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Can not remove from a leaf");
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++)
			temp += '-';
		System.out.println(temp + name);
	}

}
