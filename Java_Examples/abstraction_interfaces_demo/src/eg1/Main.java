package eg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Accessing Implementor using MyInterface");
		MyInterface1 i1 = new Implementor();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.method4();
		
		System.out.println("\n\nAccessing Implementor using MyInterface2");
		MyInterface2 i2=new Implementor();
		i2.call1();
		i2.common();
		i2.call2();
		
		System.out.println("\n\nAccessing Implementor using MyInterface2.InnerInterface");
		MyInterface2.InnerInterface in=new Implementor();
		in.inner1();
		in.inner2();
	}

}
