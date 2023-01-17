package leetC;

public class FindFirstandLastPositionofElementSortedArray1 {

	
	public static int[] searchRange(int[] nums, int target) {
		
	    int[] result = {-1, -1};
	   
	    if(nums.length<1) {
	    	return result;
	    }
	    
	    
	    int leftIdx = findFirst(nums, target);
	   
	    if (leftIdx == -1) {
	        return result;
	    }
	    int rightIdx = findLast(nums, target);
	    result[0] = leftIdx;
	    result[1] = rightIdx;
	    return result;
	}

	private static int findFirst(int[] nums, int target) {
	    int left = 0;
	    int right = nums.length - 1;
	    while (left < right) {
	        int mid = (left + right) / 2;
	        if (nums[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid;
	        }
	    }
	    if (nums[left] != target) {
	        return -1;
	    }
	    return left;
	}

	private static int findLast(int[] nums, int target) {
	    int left = 0;
	    int right = nums.length - 1;
	    while (left < right) {
	        int mid = (left + right + 1) / 2;
	        if (nums[mid] > target) {
	            right = mid - 1;
	        } else {
	            left = mid;
	        }
	    }
	    return left;
	}

	
	public static void main(String[] args) {
		
		int[] nums = {};
		
		int target = 2;
		
		int[] a = searchRange(nums,target);
		
		for (int i : a) {
			System.out.println(i);
		}

		
	}

}
