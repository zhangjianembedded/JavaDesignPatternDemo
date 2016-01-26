package 访问者模式;

interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
