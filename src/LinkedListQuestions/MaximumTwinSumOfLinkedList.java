package LinkedListQuestions;

public class MaximumTwinSumOfLinkedList {
    public static int pairSum(Node head) {

        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = rev(slow.next);
        Node p1 = head;
        Node p2 = temp;

        int max = Integer.MIN_VALUE;

        while(p2 != null){
            int sum = p1.data + p2.data;
            if(sum > max){
                max = sum ;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }

    public static Node rev(Node head){

        Node curr = head, prev = null, agla = null;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;
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
        int ans = pairSum(a);
        System.out.println(ans);
    }
}
