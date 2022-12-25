package DailyStrack;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

	public static void main(String[] args) {
		int[] nums = {4,5,2,1};
		int[] queries = {3,6,7};
		
		int[] list2 = answerQueries(nums, queries);
		
		for(int i =0;i<list2.length;i++)
			System.out.print(list2[i]);
	}
	
	private static int[] answerQueries(int[] nums, int[] queries) {
		
		int[] list = new int[queries.length];
		
		Arrays.sort(nums);
		
		for(int i = 0;i<queries.length;i++) {
			
			int value = queries[i];
			int sum=0,maxLength = 0;
			for(int j = 0;j<nums.length;j++) {
				
				sum = sum + nums[j];
				
				if(sum<=value) {
					maxLength++;
					list[i] = maxLength;
				}
			}
		}
		if(queries[queries.length-1]==1) {
			list[queries.length-1] = 0;
			return list;
		} else {
			return list;
		}
	}
}
