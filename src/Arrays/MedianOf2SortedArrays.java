package Arrays;

import java.util.Arrays;

public class MedianOf2SortedArrays {

	public static void main(String[] args) {
		
		int[] nums1 = {};
		
		int[] nums3 = {2,3};
		
		int[] num2 = new int[nums1.length+nums3.length];
		
		for(int i = 0,j=0;i<num2.length;i++) {
			
			
			if(i<nums1.length) {
				num2[i] = nums1[i];
			} else	if(i>=nums1.length) {
				num2[i] = nums3[j];
				j++;
			}
			
		}
		
		Arrays.sort(num2);
		
		int n = num2.length;
		Double median =0.0;
		if(n>3) {
		median = (double) ((num2[n/2] + num2[n/2-1]+.0)/2);
		} else if(n<=3) {
			median = (double)(num2[n/2]+.0);
			if(nums1.length ==0||nums3.length==0) {
				median = (double) (num2[1]+num2[0])/2;
			}
		} 
		
		String s = "madam";
		
		char ch[] = new char[s.length()];
		ch = s.toCharArray();
		
		String s1 = ch.toString();
		System.out.println(s1);
			
		System.out.println(median);
		
		System.out.println(nums1.length+" "+nums3.length);
		
		//System.out.println(num2.length+" \n"+nums1[1]);
	
		
	}

}
