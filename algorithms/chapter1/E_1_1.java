package algorithms.chapter1;

public class E_1_1 {

	public static void main(String args[])
	{
		System.out.println("the reslut of chapter 1.1.1!");
		exe1();
	}
	
	private static void exe1()
	{
		int a = 0;
		int b=15;
		System.out.println("1.a (0+15)/2 is :"+(a+b)/2);
		
		double a2 = 2.0e-6;
		double b2 = 100000000.1;
		System.out.println("1.b 2.0e-6 * 100000000.1:"+ a2 * b2);
		Boolean result = true && false || true && true;
		System.out.println("1.c true && false || true && true :"+ result);
	}
}


