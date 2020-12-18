package eg2;

public class ParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("accessing using Parent");
		Parent p=new Impl();
		p.parent1();
		p.parent2();
		p.parent3();
		
		System.out.println("\n\naccessing using Child");
		Child c=new Impl();
		c.parent1();
		c.parent2();
		c.parent3();
		c.child1();
		c.child2();
	}

}
