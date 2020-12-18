package eg1;

public class Implementor implements MyInterface1,MyInterface2,MyInterface2.InnerInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1() of MyInterface1 X = "+MyInterface1.X);
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2() of MyInterface1 X = "+MyInterface1.X);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3() of MyInterface1 X = "+MyInterface1.X);
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4() of MyInterface1 X = "+MyInterface1.X);
	}

	@Override
	public void call1() {
		// TODO Auto-generated method stub
		System.out.println("call1() from MyInterface2 X = "+MyInterface2.X);
		
	}

	@Override
	public void call2() {
		// TODO Auto-generated method stub
		System.out.println("call2() from MyInterface2 X = "+MyInterface2.X);
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("common() for MyInterface1 and MyInterface2");
	}

	@Override
	public void inner1() {
		// TODO Auto-generated method stub
		System.out.println("Hello inner1()");
	}

	@Override
	public void inner2() {
		// TODO Auto-generated method stub
		System.out.println("Hello inner2()");
	}

}
