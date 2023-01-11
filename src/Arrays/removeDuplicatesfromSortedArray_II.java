package Arrays;

public class removeDuplicatesfromSortedArray_II {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(nums));
		
		int[] count = new int[1001];
		System.out.println(count);
	}
	 public static int removeDuplicates(int[] nums) {
	        int count = 1;
	        int appear = 1;
	        for(int i = 1; i < nums.length; i++){
	            if(nums[i] == nums[i - 1]){
	                if(appear == 1){
	                    nums[count] = nums[i];
	                    count++;
	                    appear++;
	                }else if(appear == 2) 
	                			continue;
	            }else{
	                nums[count] = nums[i];
	                count++;
	                appear = 1;
	            }
	        }
	        return count;
	    }

}
