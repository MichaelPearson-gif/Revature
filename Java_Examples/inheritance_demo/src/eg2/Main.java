package eg2;

public class Main {

	public static void main(String[] args) {
		
		Project p1=new Project(9000, "Abc Corp", "Abc Corp Some Client");
		Employee e1=new  Employee(100, "Sachin", "Manager", 23333.44,p1);
		System.out.println("e1");
		System.out.println(e1);
		
		Employee e2=new Employee(101, "Richard", "Associate", 2000.33,p1);
		System.out.println("e2");
		System.out.println(e2);
		
		Project p2=new Project(9001, "SMS", "Revature");
		Employee e3=new Employee(102, "Tushar", "Manager", 33000.33, p2);
		System.out.println("e3");
		System.out.println(e3);

	}

}
