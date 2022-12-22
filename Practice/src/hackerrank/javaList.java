package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaList {
	
	
		    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner l= new Scanner(System.in);
	        int ele = l.nextInt();
	        List<Integer> ls = new ArrayList<>();
	        ls.add(ele);
	        
	        Scanner q = new Scanner(System.in);
	        String str = q.nextLine();
	        if(str=="Insert") {
	            int pos = q.nextInt();
	            int val = q.nextInt();
	            ls.add(pos, val);
	            
	        }
	        if(str == "Delete") {
	            int pos = q.nextInt();
	            ls.remove(pos);
	        }
	        
	        System.out.println(ls);
	        q.close();
	        l.close();
	    }
		
}
