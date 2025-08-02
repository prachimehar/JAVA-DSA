package LinkedListQuestions;

public class reverseLinkedList {
    public static Node reverse(Node head){
        Node prev = null;
        while(head != null){
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
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
        reverse(a);
        print(a);
    }
}
