package Arrays;

import java.util.ArrayList;
import java.util.List;

public class thunderCloud {
    public static int jumpingOnClouds(List<Integer> c) {
        int minSteps = 0;

        int i = 0;
        while (i < c.size()-1){
            if(i+2 < c.size() && c.get(i) == 0 && c.get(i+2) == 0){
                    i = i+2;
            }
            else{
                i++;
            }
            minSteps++;

        }
        return minSteps;

    }
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        System.out.println(jumpingOnClouds(c));


    }
}
