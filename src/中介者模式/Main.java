package 中介者模式;

public class Main {

	public static void main(String[] args) {
		Mediator med = new Mediator();
		// 新建一个主持人，并和中介者关联，让主持人知道中介都有什么能力（什么方法）
		Anchor anchor = new Anchor(med);

		// 新建一个嘉宾，并和中介者关联，让嘉宾知道中介都能什么能力（什么方法）
		Guest guest = new Guest(med);

		// 在中介者里面，注册主持人，和嘉宾，让中介者知道嘉宾和主持人都需要什么
		med.regAnchor(anchor);
		med.regGuest(guest);

		// 主持人说
		System.out.println("********************************");
		anchor.speak();

		// 嘉宾说
		System.out.println("********************************");
		guest.speak();

		// 主持人停止
		System.out.println("********************************");
		anchor.stop();

		// 嘉宾说
		System.out.println("********************************");
		guest.speak();

		// 主持人说
		System.out.println("********************************");
		anchor.speak();
		System.out.println("********************************");
	}

}
