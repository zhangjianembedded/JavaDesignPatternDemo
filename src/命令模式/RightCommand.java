package 命令模式;

import 建造者模式.Person;

public class RightCommand implements ICommand {
	private Receiver receiver;

	public RightCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.left();
	}

}
