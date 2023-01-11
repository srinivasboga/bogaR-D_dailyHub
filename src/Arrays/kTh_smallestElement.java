package Arrays;

import java.util.Arrays;

public class kTh_smallestElement {

	public static int kthSmallest(Integer[] arr, int K)
	{
		
		Arrays.sort(arr);
		
		for(int i:arr)
			System.out.print(i+" ");
		
		return arr[K - 1];
	}

	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int K = 2;

		System.out.print("\n "+K+"'th smallest element is "
						+ kthSmallest(arr, K));
	}


}
