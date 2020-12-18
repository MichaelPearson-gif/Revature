package eg1;

public abstract class EMS {

	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void calculateEmployee();
	public abstract void searchEmployee();
	public abstract void removeEmployee();
	
	public void commonEmployeeBenifits() {
		System.out.println("Common across all the Employees");
	}
}
