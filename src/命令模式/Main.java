package 命令模式;

public class Main {

	public static void main(String[] args) {
		Invoker invoker  =new Invoker();
		Receiver receiver =new Receiver();
		
		ICommand command = new UpCommand(receiver);
		
		invoker.action(command);
		
		command = new DownCommand(receiver);
		invoker.action(command);
		
		command = new LeftCommand(receiver);
		invoker.action(command);
		
		command = new RightCommand(receiver);
		invoker.action(command);
	}

}
