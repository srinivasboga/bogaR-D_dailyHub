package interviewPrep.warmUp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class salesByMatch {

	public static void main(String[] args) {
      List<Integer> list = Arrays.asList(44,55,11,15,4,72,26,91,80,14,43,78,70,75,36,83,78,91,17,17,54,65,60,21,58,98,87,45,75,97,81,18,51,43,84,54,66,10,44,45,23,38,22,44,65,9,78,42,100,94,58,5,11,69,26,20,19,64,64,93,60,96,10,10,39,94,15,4,3,10,1,77,48,74,20,12,83,97,5,82,43,15,86,5,35,63,24,53,27,87,45,38,34,7,48,24,100,14,80,54);
		
		//System.out.println(sockMerchant(6,list)); 3,2,1,2,6,5,4,2,3,4,5
	//List<Integer> list = Arrays.asList(3,2,1,2,6,5,4,2,3,4,5, 2);

	     list.sort(Comparator.comparing(a->a));
	     //list.forEach(System.out::print);
	     //System.out.println(list);
			/*......................................................................................................
			 * int pair = 0; for(int i = 0; i<list.size()-1;i++) {
			 * //System.out.println(list.get(i));
			 * if((i+1<list.size())&&(list.get(i).equals(list.get(i+1)))) {
			 * 
			 * pair++; System.out.println(list.get(i)+" "+list.get(i+1)+" "+pair); i++;
			 * 
			 * }
			 * 
			 * }
			 */
	     
	     for(int i =0;i<list.size();i++) {
	    	 
	    	 int s = list.get(i);
	    	 int s1 = 0;
	    	 for(int j =0;j<list.size();j++) {
	    		 
	    		 if(s==list.get(j)) {
	    			  s1 = s1 +1;
	    		 }
	    	 }
	    	 
	    	 if(s1>1&&list.get(i-1)!=list.get(i))
	    		 System.out.println(s+" repeats "+s1+" times ");
		     
	    	 
	     }
	     
	    // System.out.println(pair);
	}

}
