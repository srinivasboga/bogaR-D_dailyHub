package DailyStrack;

public class jumpGame {

	public static void main(String[] args) {
		
		//int v1,v2;
		
		int[]  nums = {3,2,1,0,4};
		int value = 0;
		/*
		 * for(int i = 0;i<nums.length-1;i++) { v1 = nums[i]; v2 = nums[i+1]; value =
		 * recur(v1,v2); System.out.println( recur(v1,v2) ); }
		 * 
		 * if(value == nums[nums.length-1]) { System.out.println(true); } else {
		 * System.out.println(false); }
		 */
		
		for(int i :nums) {
			value = Math.max(i, i+1);
		}

		System.out.println(value==nums[nums.length-1]?true:false);
		
	}

	private static int recur(int v1, int v2) {
		return Math.max(v1, v2);
	}

}
