// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
		//System.out.println("in fib1("+n+")");
		if (n == 0 || n == 1) return n;
		else if (n > 1) {
			int val1 = fib1(n-1);
			int val2 = fib1(n-2);
			//System.out.println("final ("+val1+"<>"+val2+")");
			return val1 + val2;
		}
		else return 0;
    }

    //--------------------------------------------------------------
    // Computes fib(n) using an array to cache values
    //--------------------------------------------------------------
    public static int fib2(int n)
    {
		int [] vals = new int[n+1];
		vals[0]=0;
		vals[1]=1;
		for (int i = 2;i < n+1;i++){
			vals[i]=vals[i-1]+vals[i-2];
		}
		return vals[n];
    }
}
