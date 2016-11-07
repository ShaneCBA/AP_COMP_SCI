import java.util.*;

public class TestNames {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String f=null,m=null,l=null;

		Name name1;

		Name name2;

		System.out.println("Please input information for name 1: ");
		System.out.print("First: ");
		f = scan.next();
		System.out.print("Middle: ");
		m = scan.next();
		System.out.print("Last: ");
		l = scan.next();
		name1 = new Name(f,m,l);

		System.out.println("Please input information for name 2: ");
		System.out.print("First: ");
		f = scan.next();
		System.out.print("Middle: ");
		m = scan.next();
		System.out.print("Last: ");
		l = scan.next();
		name2 = new Name(f,m,l);

		System.out.println(name1.firstMiddleLast());
		System.out.println(name1.lastFirstMiddle());
		System.out.println(name1.initials());
		System.out.println(name1.length());

		System.out.println(name2.firstMiddleLast());
		System.out.println(name2.lastFirstMiddle());
		System.out.println(name2.initials());
		System.out.println(name2.length());

		System.out.println((name1.equals(name2))?"NAMES ARE EQUAL":"NAMES AREN'T EQUAL");

	}
}