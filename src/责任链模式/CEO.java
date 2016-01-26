package 责任链模式;

public class CEO extends Handler {

	@Override
	public boolean approve(double day) {
		System.out.println("CEO审批通过");
		return true;
	}
}
