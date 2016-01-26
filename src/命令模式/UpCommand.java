package 命令模式;

import 建造者模式.Person;

public class UpCommand implements ICommand {
	private Receiver receiver;

	public UpCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.right();
	}

}
