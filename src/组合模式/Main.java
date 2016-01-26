package 组合模式;

public class Main {

	public static void main(String[] args) {
		Composite root = new Composite("Root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));

		Composite xComposite = new Composite("xComposite");
		xComposite.add(new Leaf("Leaf XA"));
		xComposite.add(new Leaf("Leaf XB"));
		root.add(xComposite);
		
		Composite xyComComposite  =new Composite("xyComComposite");
		xyComComposite.add(new Leaf("Leaf XYA"));
		xyComComposite.add(new Leaf("Leaf XYB"));
		xComposite.add(xyComComposite);
		
		root.display(0);
	}

}
