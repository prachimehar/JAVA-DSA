package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextSmallestLeftElement {
    // {6,8,0,1,3}  --> {-1,6,-1,0,1}  next greater element to right if not find put -1
    private static ArrayList<Integer> nextGreaterElementToRight(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(-1);
            }
            else if(s.peek() < arr[i]){
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }
        return ans;
    }
    private static int[] nextGreaterElemBrute(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for(int i = 0; i < n; i++){
            for(int j=i-1; j >= 0; j--){
                if(arr[j] < arr[i] ){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        ArrayList<Integer> ans = nextGreaterElementToRight(arr);
        int[] ans1 = nextGreaterElemBrute(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(ans1));



    }

}
