import java.util.*;

public class lineCompOOP {

	static Scanner sc = new Scanner (System.in);

	public static double line() {

		System.out.println ("Enter the Values for Line :=");
		double x1 = sc.nextDouble ();
		double x2 = sc.nextDouble ();
		double y1 = sc.nextDouble ();
		double y2 = sc.nextDouble ();
		double length = Math.sqrt((Math.pow((x2 - x1) , 2)) + (Math.pow((y2 - y1) , 2)) );
		System.out.println ("Length of Line is = " 	+ length);
		return length;

	}

	public static void lineComparision () {

		if (line() == line())
			System.out.println ("Equal");
		else
			System.out.println ("Not Equal");

	}

	public static void main (String[] args) {

		System.out.println ("Welcome to Line Comparision");
		lineComparision ();

	}

}
