//2 OOC -> Pre-lab & post-lab assessment (40%)
//In class activities (60%)

import java.util.*;
import java.text.*;

public class LabGrade {
	public static void main(String[] args){
		int pointsPreLab;
		int maxPointsPreLab;
		int pointsPostLab;
		int maxPointsPostLab;
		int pointsInClass;
		int maxPointsInClass;

		NumberFormat percent = NumberFormat.getPercentInstance();

		Scanner scan = new Scanner(System.in);

		System.out.print("Points you got in Pre-Lab: ");pointsPreLab = scan.nextInt();
		System.out.print("Maximum possible points in Pre-Lab: ");maxPointsPreLab = scan.nextInt();
		System.out.print("");
		System.out.print("Points you got in Post-Lab: ");pointsPostLab = scan.nextInt();
		System.out.print("Maximum possible points in Post-Lab: ");maxPointsPostLab = scan.nextInt();
		System.out.print("");
		System.out.print("Points you got for in class assignments: ");pointsInClass = scan.nextInt();
		System.out.print("Maximum possible points for in class assignments: ");maxPointsInClass = scan.nextInt();
		System.out.print("");

		double pointsOOC = (double)(pointsPostLab+pointsPreLab)/(double)(maxPointsPostLab+maxPointsPreLab);
		double pointIC = (double)pointsInClass/(double)maxPointsInClass;

		double avg = (pointsOOC*.4)+(pointIC*.6);

		System.out.println("\nOut of Class Average: "+percent.format(pointsOOC));
		System.out.println("In Class Average: "+percent.format(pointIC));
		System.out.println("Total Average: "+percent.format(avg));
	}
}