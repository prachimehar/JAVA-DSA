package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public int longestConsecutiveBrute(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            int longest = 1;
            int curr = nums[i];
            while(Contains(nums,curr+1)){
                curr++;
                longest++;
            }
            max = Math.max(longest,max);
        }
        return max;
    }
    public boolean Contains(int[] nums,int target){
        for(int num: nums){
            if(num == target){
                return  true;
            }
        }
        return false;
    }
    public int longestConsecutiveBetter(int[] nums){

        int c=0;
        int longest =0;
        int lastSmallest = Integer.MIN_VALUE;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] - 1 == lastSmallest){
                c++;
                lastSmallest = nums[i];
            }
            if(nums[i] != lastSmallest){
                c = 1;
                lastSmallest = nums[i];
            }
            longest = Math.max(longest,c);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};


    }
}
