package eg1;

public class EMSMain {

	public static void main(String[] args) {
		
		System.out.println("Accessing EMS via RevatureEMS");
		EMS revEms = new RevatureEMS();
		revEms.addEmployee();
		revEms.updateEmployee();
		revEms.calculateEmployee();
		revEms.searchEmployee();
		revEms.removeEmployee();
		
		System.out.println("\n\nAccessing EMS via XyzEMS");
		EMS xyzEMS = new XyzEMS();
		xyzEMS.addEmployee();
		xyzEMS.updateEmployee();
		xyzEMS.calculateEmployee();
		xyzEMS.searchEmployee();
		xyzEMS.removeEmployee();

	}

}
