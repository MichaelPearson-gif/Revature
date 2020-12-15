package eg1;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int day = 1;
		switch (day) {
		case 1: System.out.println("It's Monday");
		break;
		case 2: System.out.println("It's Tuesday");
		break;
		default: System.out.println("There is no matching day");
		break;
		}
		
		String s = "Michael";
		
		switch (s) {
		case "Michael": System.out.println("Yes it is Michael");
		break;
		
		default: System.out.println("No it is someone else");
		break;
		}

	}

}
