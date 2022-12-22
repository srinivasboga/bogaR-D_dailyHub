package pr;

import java.util.Scanner;

public class loopII {

	public static void main(String[] args) {
		
//		 Scanner in = new Scanner(System.in);
//	        int t=in.nextInt();
//	        for(int i=0;i<t;i++)
//	        {
//	            int a = in.nextInt();
//	            int b = in.nextInt();
//	            int n = in.nextInt();
//	            // Java Loops II - Hacker Rank Solution Java START
//	            for (int j = 0; j < n; j++) 
//	            {
//	                a += b * (int) Math.pow(2, j);
//	                System.out.print(a + " ");
//	            }
//	            System.out.println();
//	            // Java Loops II - Hacker Rank Solution Java END
//	        }
//	        in.close();
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();

		System.out.println(found(a, b, n));

		}
		in.close();
		}

		public static int found(int acc, int mult, int qty) {
		acc = acc + mult;
		if (qty == 1) return acc;
		System.out.print(acc + " ");
		return found(acc, (2*mult), --qty);
	}

}
