package LinkedListQuestions;

public class RemoveDuplicatesFromSortedList {
    public static Node deleteDuplicates(Node node) {
        if(node == null) return null;

        Node temp = node;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return node;
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
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);
        Node g = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        print(a);
        deleteDuplicates(a);
        print(a);
    }
}
