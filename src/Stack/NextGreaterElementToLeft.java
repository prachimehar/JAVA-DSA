package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementToLeft {
    private static ArrayList<Integer> nextGreaterElementToleft(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(-1);
            }
            else if(s.peek() >arr[i]){
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }
        return ans;
    }
    private static int[] nextGreaterElementToLeftBrute(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for(int i = 0; i < n; i++){
            for(int j = i-1; j >=0; j--){
                if(arr[j] > arr[i] ){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        ArrayList<Integer> ans = nextGreaterElementToleft(arr);
        int[] ans1 = nextGreaterElementToLeftBrute(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(ans1));



    }
}
