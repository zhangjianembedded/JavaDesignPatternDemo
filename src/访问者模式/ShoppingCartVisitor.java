package 访问者模式;

interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);

}
