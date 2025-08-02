package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {4,1,2,1,2};
        int ans = singleNumber(n);
        System.out.println(ans);
    }
}
