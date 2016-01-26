package 命令模式;

import 建造者模式.Person;

public class LeftCommand implements ICommand {
	private Receiver receiver;

	public LeftCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.down();
	}

}
