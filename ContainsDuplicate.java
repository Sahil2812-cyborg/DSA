import java.util.*;

class containsDuplicate {
    public boolean duplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if (s.contains(nums[i]))
                count = count - 1;
            else
                s.add(nums[i]);
        }
        if (count <0)
            return true;
        else    
            return false;
    }
}