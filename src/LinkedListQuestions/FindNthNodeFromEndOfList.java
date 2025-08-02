package LinkedListQuestions;

public class FindNthNodeFromEndOfList {

    public static Node nthFromEnd(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
             size++;
             temp = temp.next;
        }
        temp = head;
        int m = size-n+1;
        for (int i = 1; i <= m-1 ; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthFromEndInOneTraversal(Node head, int n){
        Node slow = head, fast = head;
        for (int i = 1; i <= n ; i++) {
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
        Node ans = nthFromEndInOneTraversal(a,3);
        System.out.println(ans.data);
    }

}
