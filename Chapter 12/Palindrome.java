import java.util.*;

public class Palindrome {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a string: \n\r\t>");
		System.out.println( (palindrome(scan.next()))? "It's a palindrome":"Nada palindrome" );

	}
	public static boolean palindrome(String str){
		if (str.length() == 1) return true;
		if (str.length() == 2) return (str.charAt(0)==str.charAt(str.length()-1));
		if (str.charAt(0)==str.charAt(str.length()-1)){
			//System.out.println(str);
			return palindrome( str.substring(1,str.length()-1) );
		}
		else {return false;}
	}
}