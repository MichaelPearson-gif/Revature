package lambda_demo;

public class LambdaStyleMain {

	public static void main(String[] args) {
		
		HelloFunctional h1 = () -> System.out.println("Hello Lambda");
		h1.hello();
		
		HelloFunctional h2 = () -> {
			System.out.println("Hey again");
			System.out.println("Hey again and again");
		};
		h2.hello();
		
		HelloInterfaceFunctionalByName hello = (n) -> {
			System.out.println("Helloooooo " + n);
		};
		hello.sayHello("Michael");
		
		AddFunctional add = (x,y,z) -> {
			return x + y + z;
		};
		System.out.println("result is " + add.sum(100, 333, 2222));

	}

}
