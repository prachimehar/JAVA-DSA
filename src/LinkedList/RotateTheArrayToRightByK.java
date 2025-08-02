package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class RotateTheArrayToRightByK {

        // Block Swap algorithm-------------

        public static void rev(List<Integer> list, int i, int j){
            while (i<j){
                int t = list.get(i);
                list.set(i,list.get(j));
                list.set(j,t);
                i++;
                j--;
            }
        }

        public static void blockSwap(List<Integer> list, int k, int n){
            n = list.size();
            k = k % n;
            rev(list,0,n-k-1);
            rev(list,n-k,n-1);
            rev(list,0,n-1);
        }


        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(5);

            int k =4;
            int n = list.size();
            blockSwap(list,k,n);

            System.out.println("Rotated Array by " + k + " steps: " + list);
        }

}
