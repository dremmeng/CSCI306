import java.awt.Point;

public class StringPlay {
	public static void main(String[] args) {
		String s1 = "C++ Is Cool";
		String s2 = "I love Java";
		
		String s3 = s2.substring(7, s2.length()) + s1.substring(3, s1.length());
		System.out.println(s3);
		
		Point p1 = new Point(1,1);
		Point p2 =  p1;
		Point p3 = new Point(1,1);
		

		
		if ((p1 == p2) && (p1 == p3)) {
			System.out.println("Java assigns by value and == tests for similar values");
		} else if ((p1 == p2) && (p1.equals(p3))) {
			System.out.println("Java assigns by refrence and == tests for similar memory addresses, while .equals() tests for simlar object's contents");	
		}
		
		//so p1 == p2 and p1.equals p3 works, but p1 == p3 doesn't work since Java assigns by refrence, not by value and == test for similar memory locations
		
		
		String s4 = "Hello";
		String s5 = "Hello";
		String s6 = "hello";
		
		if (s4.equals(s5)) {
			System.out.println(".equals() works for objects with similar contents");
		}
		
		if (s4.equals(s6)) {
			System.out.println(".equals() works for items of dissimilar cases");
		} else {
			System.out.println(".equals() doesn't work for items of dissimilar cases");
		}
		
		if (s4.equalsIgnoreCase(s6)) {
			System.out.print("Using .equalsIgnoreCase() allows us to compare similar strings with dissimilar cases");
		}
		
	}
}

