package algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class E_1_7 {
	
	public static void main(String args[])
	{
		exeA();
		exeB();
		exeC();
	}
	
	// Exercise 1.1.7 a
	private static void exeA()
	{
		StdOut.println("exeA result is!");
		double  t= 9.0;
		while(Math.abs(t-9.0/t)> .001)
		{
			t = (9.0/t + t) /2.0;
			StdOut.println("t is:"+t);
		}
		
	}
	
	// Exercise 1.1.7 b
	private static void exeB()
	{
		StdOut.println("exeB result is!");
		int sum = 0;
		for (int i = 1; i< 1000;i++)
		{
			for (int j=0;j<i;j++)
			{
				sum++;
			}
		}
		StdOut.println(sum);
	}
	
	// Exercise 1.1.7 c
	private static void exeC()
	{
		StdOut.println("exeC result is!");
		int sum = 0;
		for (int i = 1; i< 1000;i *= 2)
		{
			// 1,2,4,8,16,32,64,128,256,512
			for (int j=0;j<1000;j++)
			{
				sum++;
			}
		}
		StdOut.println(sum);
	}
}
