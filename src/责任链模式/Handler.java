package 责任链模式;

public abstract class Handler {
	private Handler handler;

	public Handler getHandler() throws Exception {
		if (handler == null) {
			throw new Exception("责任链断开,请检查！");
		}
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public abstract boolean approve(double day);
}
