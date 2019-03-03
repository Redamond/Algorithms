package algorithms.chapter1;

public class E_1_10 {

	public static void main(String args[])
	{
		exe();
	}
	
	private static void exe()
	{
		int[] a = new int[11];
		try {
			for (int i=0; i<10;i++)
			{
				//The local variable a may not have been initialized
				a[i]=i;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(a);

	}
}
