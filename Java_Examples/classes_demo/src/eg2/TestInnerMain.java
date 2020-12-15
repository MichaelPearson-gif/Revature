package eg2;

public class TestInnerMain {

	public static void main(String[] args) {


		Outer o = new Outer();
		o.outerMethod();
		
		Outer.InnerPublic i = o.new InnerPublic();
		i.helloInnerPublic();
		
		Outer.InnerPublicStatic.helloInnerPublicStatic();
		
		Outer.InnerPublicStatic i1 = new Outer.InnerPublicStatic();
		i1.helloInnerPublicNonStatic();

	}

}
