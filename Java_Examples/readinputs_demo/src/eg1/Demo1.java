package eg1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter contact");
		long contact = sc.nextLong();
		System.out.println("Enter gender(m/f/o)");
		char gender = sc.next().charAt(0);
		System.out.println("Hello " + name);
		System.out.println("Age = " + age);
		System.out.println("Contact = " + contact);
		System.out.println("Gender = " + gender);

	}

}
