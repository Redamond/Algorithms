package algorithms.chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E_1_5 {
	
	public static void main(String args[])
	{
		System.out.println("the reslut of chapter 1.1.5!");
		exe5();
	}
	
	private static void exe5()
	{
		double x,y;
		System.out.println("Please Enter Double Value x,y:");
		x = StdIn.readDouble();
		y = StdIn.readDouble();
		System.out.println(checkBetween(x) && checkBetween(y));
	}
	
	private static Boolean checkBetween(Double a)
	{
		if (a>0 && a <1)
		{
			return true;
		}
		return false;
	}
}
