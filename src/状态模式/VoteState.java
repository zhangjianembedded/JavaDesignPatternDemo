package 状态模式;

interface VoteState {
	void vote(String user, String voteItem, VoteManager voteManager);
}
