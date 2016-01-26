package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> list = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++)
			temp += '-';
		System.out.println(temp + name);

		for (Component c : list) {
			c.display(depth + 3);
		}
	}

}
