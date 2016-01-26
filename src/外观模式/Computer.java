package 外观模式;

public class Computer {
	private CPU cpu;
	private Memory memory;

	public Computer() {
		super();
		this.cpu = new CPU();
		this.memory = new Memory();
	}

	public void startup() {
		this.cpu.startup();
		this.memory.startup();
	}

	public void shutdown() {
		this.cpu.shutdown();
		this.memory.shutdown();
	}
}
