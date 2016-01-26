package 建造者模式;

interface PersonBuilder {
	void buildHead();

	void buildHand();

	void buildBody();

	void buildFoot();

	Person buildPerson();
}
