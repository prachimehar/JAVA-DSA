package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GemStones {
    public static HashSet<Character> gemstones(List<String> arr) {

        HashSet<Character> setMinerals = new HashSet<>();

        for(char ch : arr.get(0).toCharArray()){ // {a,b,c,d,d,e}
            setMinerals.add(ch);
        }

        for(int i=1; i< arr.size(); i++){

            HashSet<Character> set = new HashSet<>();

            for(char ch : arr.get(i).toCharArray()){
                set.add(ch);
            }

            setMinerals.retainAll(set);

        }

        return setMinerals;
    }

    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        c.add("abcdde");
        c.add("baccd");
        c.add("eeabg");

        System.out.println(gemstones(c));

    }
}
