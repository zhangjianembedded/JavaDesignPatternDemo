package 建造者模式;

public class ManBuilder implements PersonBuilder {
	private Person person;

	public ManBuilder() {
		person = new Man();
	}

	@Override
	public void buildHead() {
		person.setHead("男人的头部");
	}

	@Override
	public void buildHand() {
		person.setHand("男人的双手");

	}

	@Override
	public void buildBody() {
		person.setBody("男人的身体");
	}

	@Override
	public void buildFoot() {
		person.setFoot("男人的双脚");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
