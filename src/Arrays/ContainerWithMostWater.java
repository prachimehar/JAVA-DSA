package Arrays;

public class ContainerWithMostWater {
    public static int maxAreaBrute(int[] arr) {
        //TLE time limit exceed 0(n^2)
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int w = j-i;
                int area = Math.min(arr[i],arr[j]);
                max = Math.max(area*w,max);
            }
        }
        return max;
    }
    public static int maxAreaOptimal(int[] arr) {
        int left = 0, right = arr.length-1;
        int max = 0;
        while (left < right){
            int w = right - left;
            int area = Math.min(arr[left],arr[right]) * w;
            max = Math.max(area,max);

            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println("Second Max: " + maxAreaOptimal(arr));
    }
}
