package leetC;

import java.util.ArrayList;
import java.util.List;

public class FindFirstandLastPositionofElementSortedArray {

	public static void main(String[] args) {
		
		
		int[] nums = {2,2};
		
		int target = 1;
		
		List<Integer> list = new ArrayList<Integer>();
		
		int[] a = new int[2];
		
		/*
		 * for(int i:nums) { list.add(i); }
		 * 
		 * if(nums.length>0) { a[0] = list.indexOf(target); a[1] =
		 * list.lastIndexOf(target);
		 * 
		 * } else if(nums.length==0||(a[0]==0&&a[1]==0)) {
		 * 
		 * a[0] = -1; a[1] = -1; }
		 * 
		 * System.out.println(a[0]+" "+a[1]);
		 * 
		 * 
		 */
		 int n = nums.length; boolean c = false, c1 = false;
		  if(n>0) { for(int i = 0,j=n-1;i<n;i++,j--) { if(nums[i]==target&&c==false) {
		  a[0] = i; c = true; } if(nums[j]==target&&c1==false) { a[1] = j; c1 = true; }
		  } } if((nums.length==0)||(c==false)) { a[0] = -1; a[1] = -1;
		  
		  }
		  
		  
		  
		  System.out.println(a[0]+" "+a[1]);
		 
	}

}
