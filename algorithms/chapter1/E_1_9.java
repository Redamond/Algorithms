package algorithms.chapter1;

/**
 * This Exercise is how change an Integre to Binary
 * 
 * @author reeed
 *
 */
public class E_1_9 {

	public static void main(String args[]) {

		method1(0);
		method1(1);
		method1(2);
		method1(13);
	}

	/**
	 * 13 %2 =1; 13/2 = 6; 6 %2 =0; 6 /2 = 3; 3 %2 =1; 3 /2 = 1; 1 %2 =1; 1 /2 =0;
	 * 13 Binary = 1101; 2 %2 =0; 2/2 = 1; 1 %2 = 1; 1/2 = 0;
	 * 
	 * @param i
	 */
	private static void method1(int i) {
		String s = "";
		String t = "";
		if (i == 0)
			System.out.println("0");
		else {
			for (int b = i; b > 0; b = b / 2) {
				t = String.valueOf(b % 2);
				s = t + s;
			}
			System.out.println(s);
		}

	}

}
