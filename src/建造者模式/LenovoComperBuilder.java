package 建造者模式;

public class LenovoComperBuilder implements ComputerBuilder {
	private Computer computer;

	public LenovoComperBuilder() {
		this.computer = new LenovoComputer();
	}

	@Override
	public void buildXianshiqi() {
		computer.setXianshiqi("联想的显示器");
	}

	@Override
	public void buildZhuji() {
		computer.setZhuji("联想的主机");
	}

	@Override
	public void buildShubiao() {
		computer.setShubiao("联想的鼠标");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
