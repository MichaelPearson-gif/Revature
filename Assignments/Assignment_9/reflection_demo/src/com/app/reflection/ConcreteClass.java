package com.app.reflection;

@Deprecated
public class ConcreteClass extends BaseClass implements BaseInterface {

	public int publicInt;
	private String privateString = "private string";
	protected boolean protectedBoolean;
	Object defaultObject;
	
	
	
	public ConcreteClass(int i) {
		super();
		this.publicInt = i;
	}

	@Override
	public void method1() {
		System.out.println("Method 1 impl.");

	}

	@Override
	public int method2(String str) {
		System.out.println("Method2 impl.");
		return 0;
	}
	
	@Override
	public int method4() {
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	public int method5(int i){
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	// inner classes
	public class ConcreteClassPublicClass{};
	private class ConcreteClassPrivateClass{};
	protected class ConcreteClassProtectedClass{};
	class ConcreateClassDefaultClass{};
	
	// member enum
	enum ConcreteClassDefaultEnum{};
	public enum ConcreteClassPublicEnum{};
	
	// Member interface
	public interface ConcreteClassPublicInterface{};

}
