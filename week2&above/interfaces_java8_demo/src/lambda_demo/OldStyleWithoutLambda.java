package lambda_demo;

public class OldStyleWithoutLambda implements HelloFunctional {


	public static void main(String[] args) {

		HelloFunctional h=new OldStyleWithoutLambda();
		h.hello();
		
		HelloFunctional h1=new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
			System.out.println("Hello old Style Inner");	
			}
		};
		h1.hello();
		
		HelloFunctional h2=new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello again old inner");
			}
		};
		h2.hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello old style");
	}

}
