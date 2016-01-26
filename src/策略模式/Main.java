package 策略模式;

public class Main {
	public static void main(String[] args) {
//		MemberStrategy strategy = new PrimaryMemberStrategy();
//		MemberStrategy strategy = new IntermediateMemberStrategy();
		MemberStrategy strategy = new AdvancedMemberStrategy();
		Price price = new Price(strategy);
		double p = price.quote(100.00d);
		System.out.println(p);
	}
}
