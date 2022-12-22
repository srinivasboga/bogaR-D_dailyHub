package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addTwoNumbers {

	public static void main(String[] args) {
		

		List<Integer> list = Arrays.asList(2,4,3);
		List<Integer> list1 = Arrays.asList(5,6,4);
		List<Integer> result = new ArrayList<>();
		int l2Size = list1.size();
		int i1 = 0,i2=0,n1;
		for(int i = 0;i<list.size();i++) {
			i1 = i1*10+list.get(i);
			if(i<l2Size) {
				i2 = i2*10+list1.get(i);
			}
		}
		
		/*
		 * for(int i = 0;i<list1.size();i++) { i2 = i2*10+list1.get(i); }
		 */	
		int sum = i1+i2;
		System.out.println(sum);
		do {
			n1=sum%10;
			result.add(n1);
			sum = sum/10;
		}while(sum>=1);
		
		System.out.println(result);
		
		
	}

}
