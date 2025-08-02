package Arrays;

import java.util.Arrays;

public class checkDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7,4};
        // tc - 0(n^2) sc - 0(1)
//        boolean ans = false;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    ans = true;
//                    break;
//                }
//            }
//        }
//        System.out.println(ans);

        // tc-0(n) sc -0(n)
//        boolean ans = false;
//        HashSet<Integer> set = new HashSet<>();
//        for (int num: arr){
//            if(!set.add(num)){
//                ans = true;
//            }
//        }
//        System.out.println(ans);
//
         // tc - 0(n log n) sc - 0(1)
        Arrays.sort(arr);
        boolean ans = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                ans = true;
                break;
            }
        }
        System.out.println(ans);

    }
}
