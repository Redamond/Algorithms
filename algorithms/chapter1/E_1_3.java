package algorithms.chapter1;

import edu.princeton.cs.algs4.StdIn;

public class E_1_3 {
	
	public static void main(String args[])
	{
		System.out.println("the reslut of chapter 1.1.3!");
		exe3();
	}
	
	private static void exe3()
	{
		System.out.println("Please entre first Integer");
		int a = StdIn.readInt();
		System.out.println("Please entre second Integer");
		int b = StdIn.readInt();
		System.out.println("Please entre thred Integer");
		int c = StdIn.readInt();
		Boolean result  = a==b && b==c;
		if (result)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}

}
