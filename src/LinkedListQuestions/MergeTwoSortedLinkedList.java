package LinkedListQuestions;

public class MergeTwoSortedLinkedList {
    public static Node merge(Node l1,Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return dummy.next;
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

        Node m = new Node(1);
        Node n = new Node(3);
        Node o = new Node(5);
        Node p = new Node(7);
        Node q = new Node(9);
        Node r = new Node(11);
        m.next = n;
        n.next = o;
        o.next = p;
        p.next = q;
        q.next = r;

        print(a);
        Node ans = merge(a,m);
        print(ans);
    }
}
