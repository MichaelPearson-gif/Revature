package eg1;

import eg2.AnotherPack;

public class HelloMethod {

	public static void main(String[] args) {

		// method name directly if the static method is of same class
		iAmStatic();
		iAmStatic("Michael");
		
		// ClassName.methodName() to access static methods of different class
		Another.iAmStaticAnother();
		Another.iAmStaticAnother("Michael");
		
		AnotherPack.iAmStaticAnotherPack();
		AnotherPack.iAmStaticAnotherPack("Michael");
		
		// ClassName ObjectName = new(dynamic memory allocation) Constructor()
		HelloMethod h = new HelloMethod(); //instantiation or object creation
		h.iAmNotStatic();
		h.iAmNotStaticAgain();
		
		AnotherPack a = new AnotherPack();
		a.iAmNoNStaticAnotherPack();
	}
	
	public static void iAmStatic() {
		System.out.println("Hello static");
	}
	
	public static void iAmStatic(String name) {
		System.out.println("Hello static by name and name = " + name);
	}
	
	public void iAmNotStatic() {
		System.out.println("Non static method of HelloMethod class");
	}
	
	public void iAmNotStaticAgain() {
		System.out.println("Non static again method of HelloMethod class");
	}

}
