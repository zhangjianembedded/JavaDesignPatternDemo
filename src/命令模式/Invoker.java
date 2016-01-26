package 命令模式;

public class Invoker {
	public void action(ICommand command) {
		command.execute();
	}
	
	
}
