package 访问者模式;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = book.getPrice();
		System.out.println("Book ISBN:"+book.getIsbnNumber() + ",price:" + book.getPrice());
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit:"+fruit.getName() + ",price:" + cost);
		return cost;
	}

}
