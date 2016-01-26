package 状态模式;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	private VoteState voteState;
	//user 
	private Map<String, String> mapVote = new HashMap<>();
	//user count
	private Map<String, Integer> mapVoteCount = new HashMap<>();

	public void vote(String user, String voteItem) {
		Integer oldVoteCount = mapVoteCount.get(user);
		if (oldVoteCount == null) {
			oldVoteCount = 0;
		}
		oldVoteCount++;
		mapVoteCount.put(user, oldVoteCount);
		if (oldVoteCount == 1) {
			voteState = new NormalVoteState();
		} else if (oldVoteCount > 1 && oldVoteCount < 5) {
			voteState = new RepeatVoteState();
		} else if (oldVoteCount >= 5 && oldVoteCount < 8) {
			voteState = new SpiteVoteState();
		} else if (oldVoteCount >= 8 ) {
			voteState = new BlackVoteState();
		}
		voteState.vote(user, voteItem, this);
	}

	public VoteState getVoteState() {
		return voteState;
	}

	public void setVoteState(VoteState voteState) {
		this.voteState = voteState;
	}

	public Map<String, String> getMapVote() {
		return mapVote;
	}

	public void setMapVote(Map<String, String> mapVote) {
		this.mapVote = mapVote;
	}

	public Map<String, Integer> getMapVoteCount() {
		return mapVoteCount;
	}

	public void setMapVoteCount(Map<String, Integer> mapVoteCount) {
		this.mapVoteCount = mapVoteCount;
	}

}
