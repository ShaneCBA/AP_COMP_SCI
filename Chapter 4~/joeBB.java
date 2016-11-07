import java.util.*;
public class joeBB {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Student 1 Name: ");String s1Name = scan.next();
		System.out.print("Student 2 Name: ");String s2Name = scan.next();
		BandBooster bandBoost1 = new BandBooster(s1Name);
		BandBooster bandBoost2 = new BandBooster(s2Name);

		System.out.print("Enter the number of boxes sold by "+bandBoost1.getName()+" week 1: ");
		bandBoost1.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by "+bandBoost1.getName()+" week 2: ");
		bandBoost1.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by "+bandBoost1.getName()+" week 3: ");
		bandBoost1.updateSales(scan.nextInt());

		System.out.print("Enter the number of boxes sold by "+bandBoost2.getName()+" week 1: ");
		bandBoost2.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by "+bandBoost2.getName()+" week 2: ");
		bandBoost2.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by "+bandBoost2.getName()+" week 3: ");
		bandBoost2.updateSales(scan.nextInt());

		System.out.println(bandBoost1);
		System.out.println(bandBoost2);
	}
}