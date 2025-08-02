package LinkedListQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BuildInLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        String d = list.isEmpty()? "yes":"no";
        System.out.println(d);
        System.out.println(list.contains(20));
        list.removeFirst();
        list.removeLast();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);
        list.clear();
        list.add(2,67);
        list.getLast();
        list.getFirst();
        list.remove(1);
        Collections.reverse(list);
        list.get(list.size()/2);
        int n=4;
        list.get(list.size()-n);

        System.out.println("Total nodes: " + list.size());

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10); list1.add(20);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(30); list2.add(40);

        list1.addAll(list2);
        System.out.println("Merged List: " + list1);

        Collections.sort(list);
        LinkedList<Integer> clone = (LinkedList<Integer>) list.clone();
        System.out.println(clone);



    }
}
