package 命令模式.files;

interface FileSystemReceiver {
	void openFile();

	void writeFile();

	void closeFile();
}
