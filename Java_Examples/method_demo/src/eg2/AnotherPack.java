package eg2;

public class AnotherPack {
	public static void iAmStaticAnotherPack() {
		System.out.println("Hello static from AnotherPack class");
	}
	
	public static void iAmStaticAnotherPack(String name) {
		System.out.println("Hello static by name from AnotherPack class and name = " + name);
	}
	
	public void iAmNoNStaticAnotherPack() {
		System.out.println("Non non-static from AnotherPack class");
	}
}

