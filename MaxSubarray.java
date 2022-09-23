import java.util.*;

public class MaxSubarray {
    public int maxSubArray(int[] nums){
        int curMax = nums[0];
        int maxSum = curMax;
        for(int i=1;i<nums.length;i++){
            if(curMax < 0)
                curMax=0;
            maxSum = Math.max(curMax, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxSubarray m = new MaxSubarray();
        int[] nums = {1};
        System.out.print(m.maxSubArray(nums));
        Arrays
    }
}
