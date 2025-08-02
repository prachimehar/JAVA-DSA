package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumOptimal(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSumBetter(int[] nums, int target){
        int i=0,j=1;
        while(i<nums.length-1){
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
            j++;
            if(j == nums.length){
                i++;
                j = i+1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumBrute(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSumOptimal(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}
