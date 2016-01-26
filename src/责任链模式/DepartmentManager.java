package 责任链模式;

public class DepartmentManager extends Handler {

	@Override
	public boolean approve(double day) {
		if (day <= 5) {
			System.out.println("部门经理审批通过");
			return true;
		} else {
			System.out.println("部门经理传给了他的上司");
			try {
				return getHandler().approve(day);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
	}

}
