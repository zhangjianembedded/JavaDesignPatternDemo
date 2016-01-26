package 状态模式;

public class Main {

	public static void main(String[] args) {
		VoteManager voteManager = new VoteManager();
		
		for (int i = 0; i < 10; i++) {
			voteManager.vote("zhangsan", "班长");
		}
	}

}
