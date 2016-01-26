package 享元模式.单纯享元模式;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<Character, Flyweight> map = new HashMap<Character, Flyweight>();

	public Flyweight factory(Character state) {
		Flyweight flyweight = map.get(state);
		if (flyweight == null) {
			flyweight = new ConcreteFlyweight(state);
			map.put(state, flyweight);
		}
		return flyweight;
	}
}
