package Arrays;

public class smallestAndLargestN {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6};
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(max +" "+min);
        // second Smallest and largest

        int[] arr = {2,3,4,5,6};
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] != max && arr[i] > secMax ){
                secMax = arr[i];
            }

            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] != min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        System.out.println(secMax +" "+secMin);

    }

}
