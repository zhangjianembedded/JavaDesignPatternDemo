package 建造者模式;

public class Main {

	public static void main(String[] args) {
		
		ProductDirector director = new ProductDirector( );
		
		Person person =director.createPerson(new ManBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getHand());
		System.out.println(person.getFoot());
		
		
		Computer computer =director.createComputer(new LenovoComperBuilder());
		System.out.println(computer.getXianshiqi());
		System.out.println(computer.getZhuji());
		System.out.println(computer.getShubiao());
	}

}
