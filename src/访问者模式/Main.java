package 访问者模式;

public class Main {
	public static void main(String[] args) {
		ItemElement[] items = { new Book(20, "1234"), new Book(30, "6789"),
				new Fruit(2, 3, "apple"), new Fruit(1, 4, "banana") };
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int totalPrice = 0;
		for (ItemElement element : items) {
			totalPrice += element.accept(visitor);
		}
		System.out.println("Total"+totalPrice);
	}
}
