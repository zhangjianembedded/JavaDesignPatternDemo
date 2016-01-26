package 状态模式;

public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
	    voteManager.getMapVote().put(user, voteItem);
		System.out.println("恭喜投票成功！");
	}

}
