package 命令模式;

import 建造者模式.Person;

public class DownCommand implements ICommand {
	private Receiver receiver;

	public DownCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.up();
	}

}
