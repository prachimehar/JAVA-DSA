package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,5,5,6,6,6,6,7,7};
        // using countFreq function --------
        int size = arr.length;
        countFreq(arr, size);
        System.out.println("--------------------------------------------");
        // using boolean array -------------
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        for (int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;
            int c = 1;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    c++;
                }
            }
            System.out.println(arr[i] + " -> " + c);
        }
        System.out.println("--------------------------------------------");

        // By using hashmap -----
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    static void countFreq(int[] arr, int n)
    {

        Arrays.sort(arr);

        // Traverse the sorted array
        for (int i = 0; i < n; i++)
        {
            int count = 1;

            // Move the index ahead whenever
            // you encounter duplicates
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            System.out.println(arr[i] + " -> " + count);

        }
    }
}
