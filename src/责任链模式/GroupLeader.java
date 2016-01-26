package 责任链模式;

public class GroupLeader extends Handler {

	@Override
	public boolean approve(double day) {
		if (day <= 0.5) {
			System.out.println("小组长审批通过");
			return true;
		} else {
			System.out.println("小组长传给了他的上司");
			try {
				return getHandler().approve(day);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
	}

}
