package eg2;

public class Main {

	public static void main(String[] args) {
		
		Project p1=new Project(9000, "Abc Corp", "Abc Corp Some Client");
		Employee e1=new  Employee(100, "Sachin", "Manager", 23333.44,p1);
		Address pea1 = new Address(2103, "Washington Dr.", "San Fransisco", 95120);
		Address pre1 = new Address(1103, "Jefferson Rd.", "San Fransisco", 95122);
		System.out.println("e1");
		System.out.println(e1);
		System.out.println("p1");
		System.out.println(p1);
		System.out.println("pea1");
		System.out.println(pea1);
		System.out.println("pre1");
		System.out.println(pre1);
		
		Employee e2=new Employee(101, "Richard", "Associate", 2000.33,p1);
		System.out.println("e2");
		System.out.println(e2);
		
		
		Project p2=new Project(9001, "SMS", "Revature");
		Address pea2 = new Address(200, "Matinal", "London", 97819);
		Address pre2 = new Address(500, "El Diablo", "London", 97812);
		System.out.println("p2");
		System.out.println(p2);
		System.out.println("pea2");
		System.out.println(pea2);
		System.out.println("pre2");
		System.out.println(pre2);
		Employee e3=new Employee(102, "Tushar", "Manager", 33000.33, p2);
		System.out.println("e3");
		System.out.println(e3);
		
		Team t1 = new Team(210, "Lakers", "Steve Giddion");
		Player pl1 = new Player(1, "Michael Jordan", 25.5, t1);
		System.out.println("t1");
		System.out.println(t1);
		System.out.println("pl1");
		System.out.println(pl1);

	}

}
