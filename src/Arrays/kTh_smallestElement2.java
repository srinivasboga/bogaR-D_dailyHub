package Arrays;

import java.util.Arrays;

public class kTh_smallestElement2 {

	
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int K = 2;
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n"+arr[K-1]);
		
	}


}
