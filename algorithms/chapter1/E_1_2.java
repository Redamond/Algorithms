package algorithms.chapter1;

public class E_1_2 {
	public static void main(String args[]) {
		System.out.println("the reslut of chapter 1.1.2!");
		exe2();
	}

	private static void exe2() {
		int a = 1;
		double b = 2.236;
		double c = (a + b) / 2;
		System.out.println("2.a (1+2.236)/2 is :" + c);

		int a2 = 1;
		int b2 = 2;
		int c2 = 3;
		double d2 = 4;

		System.out.println("2.b 1+2+3+4.0 is :" + (a2 + b2 + c2 + d2));

		System.out.println("2.c 4.1>4 is Boolean :" + (4.1 > 4));

		int a4 = 1;
		int b4 = 2;
		String c4 = "3";
		String result = a4 + b4 + c4;
		System.out.println("2.d 1+2+\"3\" is :" + result);

	}
}
