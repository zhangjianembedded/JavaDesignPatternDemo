package 享元模式.复合享元模式;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {
	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	/**
	 * 增加一个新的单纯享元对象到聚集中
	 */
	public void add(Character key, Flyweight fly) {
		files.put(key, fly);
	}

	@Override
	public void operation(String state) {
		Flyweight fly = null;
		for (Character c : files.keySet()) {
			fly = files.get(c);
			fly.operation(state);
		}

	}

}
