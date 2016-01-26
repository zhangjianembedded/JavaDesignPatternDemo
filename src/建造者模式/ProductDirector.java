package 建造者模式;

public class ProductDirector {

	public Person createPerson(PersonBuilder builder) {
		builder.buildHead();
		builder.buildBody();
		builder.buildHand();
		builder.buildFoot();
		return builder.buildPerson();
	}

	public Computer createComputer(ComputerBuilder builder) {
		builder.buildXianshiqi();
		builder.buildZhuji();
		builder.buildShubiao();
		return builder.getComputer();
	}
}
