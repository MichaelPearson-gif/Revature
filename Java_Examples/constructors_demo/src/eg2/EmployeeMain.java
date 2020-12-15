package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Michael");
		System.out.println("Printing e1");
		e1.printEmployee();
		
		Employee e2 = new Employee(101, "Chuck");
		System.out.println("\nPrinting e2");
		e2.printEmployee();
		
		Employee e3 = new Employee(102, "Ryan", 123456789, "New York");
		System.out.println("\nPrinting e3");
		e3.printEmployee();

	}

}
