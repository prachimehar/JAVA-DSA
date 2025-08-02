package Arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] nums) {

        int buy = nums[0]; int max = 0;

        for(int i=1; i< nums.length; i++){
            if(nums[i] <= buy){
                buy = nums[i];
            }
            else{
                max = Math.max(max,nums[i]-buy);
            }
        }
        return max;

    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
