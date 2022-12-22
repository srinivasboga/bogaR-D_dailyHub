package pr;

import java.util.Scanner;

public class loop {

	public static void main(String []argh){
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        for(int i=0;i<t;i++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		            
		            int count= a + ((int)Math.pow(2,0))*b;
		            int count1= count + ((int)Math.pow(2,1))*b;
		            
		            int count2 ;
		            
		            System.out.print(count+" "+count1);
		            
		            for(int j = 2; j<n+1;j++){
		                count2 = count1 + ((int)Math.pow(2,j))*b;
		                System.out.print(" "+count2);
		                count1 = count2;
		                count = count1;
		            }
		            System.out.println();
		         }
		        in.close();
		    }
		}
