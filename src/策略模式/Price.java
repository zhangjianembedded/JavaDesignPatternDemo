package 策略模式;

public class Price {
	private MemberStrategy strategy;

	public Price(MemberStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public double quote(double booksPrice) {
		return strategy.calcPrice(booksPrice);
	}
}
