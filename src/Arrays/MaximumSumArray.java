package Arrays;

public class MaximumSumArray {
    public static int maxSubArrayBrute(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    public static int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        int start= 0,tempStart=0,end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; 
            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //Kadane’s Algorithm
        int[] arr = {1, 2, -1, 4, 5, 6};
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            sum = Math.max(num, sum + num);
            max = Math.max(sum, max);
        }

        System.out.println("Maximum Subarray Sum: " + max);
        int maxi = maxSubArray(arr);
        System.out.println(maxi);
    }


}
