package LinkedListQuestions;

import static LinkedListQuestions.reverseLinkedList.reverse;

public class ReorderList {
    public static void reorderList(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);
        slow.next = null;

        Node firstHalf = head;
        while(secondHalf != null){
            Node t1 = firstHalf.next;
            Node t2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = t1;

            firstHalf = t1;
            secondHalf = t2;
        }
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        print(a);
        reorderList(a);
        print(a);
    }
}
