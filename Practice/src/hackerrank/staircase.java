package hackerrank;

import java.util.Scanner;

public class staircase {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		int n = 6;
		
		//String b = " ";
	    
//	    for(int i = 0,j=n;i<n;i++,j--){
//	        
//	        int test = j;
//	        while(test-1<=n){
//	        	
//	        	System.out.println(test>n?" ":"#");
////	            String space = test>n?" ":"#";
////	            b = b + space;
//	            test = test - 1;
//	        }
//	        //System.out.println(b);
//	    }
	    
		for(int i = 0,j=n;i<=n;i++,j--) {
			
			int t = 0;
		
			while(t<=n) {
				System.out.print((t<j)?" ":"#");
				/*
				 * if(t<=j) {System.out.print(" ");} else {System.out.print("#");}
				 */
				t = t+1;
			}
			System.out.println();
			
			
		}
	    
	}

}
