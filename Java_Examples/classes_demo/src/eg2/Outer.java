package eg2;

public class Outer {

	public void outerMethod() {
		InnerPrivate i = new InnerPrivate();
		i.helloInnerPrivate();
	}
	
	private class InnerPrivate{
		public void helloInnerPrivate(){
			System.out.println("Heyy hello from helloInnerPrivate");
		}
	}
	
	public class InnerPublic {
		public void helloInnerPublic() {
			System.out.println("Heyy hello from helloInnerPublic");
		}
	}
	
	public static class InnerPublicStatic{
		public void helloInnerPublicNonStatic() {
			System.out.println("Heyy hello from helloInnerPublicNonStatic");
		}	
		public static void helloInnerPublicStatic() {
			System.out.println("Heyy hello from helloInnerPublicStatic");
		}
	}
}
/*
 * -> In Java Inner classes can be private, static, protected, and public as well
*/
