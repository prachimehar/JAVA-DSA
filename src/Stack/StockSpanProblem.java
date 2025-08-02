package Stack;

import java.util.ArrayList;
import java.util.Stack;

class Pair{
    int value;
    int index;
    Pair(int value,int index){
        this.value = value;
        this.index = index;
    }
}
public class StockSpanProblem {
    private static ArrayList<Integer> nextGreaterElementToLeft(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Pair> s = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && s.peek().value <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(i+1);
            }
            else if(s.peek().value > arr[i]){
                ans.add(i- s.peek().index);
            }
            s.push(new Pair(arr[i],i));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> ans = nextGreaterElementToLeft(arr);
        System.out.println(ans);

    }
}
