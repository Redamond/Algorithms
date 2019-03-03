package algorithms.chapter1;

public class E_1_4 {
	
	public static void main(String args[])
	{
		System.out.println("the reslut of chapter 1.1.4!");
		exe4();
	}
	
	private static void exe4()
	{
		int a = 4;
		int b = 5;
		int c = 111;
		if (a>b) c=0;
		System.out.println(" a: there is not then in Java, c is "+ c );
		if ( a>b )
		{
			c=0;
		}
		System.out.println(" b: need ()!");
		if (a>b) c=0;

		System.out.println(" c: is correct!");
		if (a>b) c = 0 ;else b=0;

		System.out.println(" d: then end need ;");
	}
}
