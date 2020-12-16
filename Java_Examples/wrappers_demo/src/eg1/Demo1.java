package eg1;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = new Integer(10);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i1==i2 " +(i1==i2));
		System.out.println("i1==i3 " +(i1==i3));
		
		System.out.println("i1.equals(i2)) " + i1.equals(i2));
		System.out.println("i1.equals(i3)) " + i1.equals(i3));
		
		int x = i1; //Autoboxing
		System.out.println("x = " + x);
		x = 1000;
		i1 = x;
		System.out.println("i1 = " + i1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Java reads everything as String and Java writes everything as String
		String s = "33";
		int age = Integer.parseInt(s); //similar method in all other Wrapper classes except Character
		System.out.println("age = " + age);
		
		age = 99;
		s = age+"";
		System.out.println("s = " + s);
		Integer i5 = 1000;
		s = i5.toString();
		System.out.println("s = " + s);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		// compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("i5 = " + i5);
		System.out.println("i5.compareTo(1000) " + i5.compareTo(1000));
		System.out.println("i5.compareTo(2000) " + i5.compareTo(2000));
		System.out.println("i5.compareTo(100) " + i5.compareTo(100));
		
		Double d = 12.55;
		int f = d.intValue();
		System.out.println("f = " + f);

	}

}
