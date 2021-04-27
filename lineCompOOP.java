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

		double length1 = line();
		double length2 = line();
		if ( length1 == length2 )
			System.out.println ("Both Line 1 and Line 2 are Equal");
		else if ( length1 > length2 )
			System.out.println ("Length of Line 1 is Greater than Line 2!");
		else if ( length1 < length2 )
			System.out.println ("Length of Line 1 is Smaller than Line 2!");

	}

	public static void main (String[] args) {

		System.out.println ("Welcome to Line Comparision");
		lineComparision ();

	}

}
