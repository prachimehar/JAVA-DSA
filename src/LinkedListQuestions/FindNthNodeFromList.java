package LinkedListQuestions;

public class FindNthNodeFromList {

    public static int nthNode(Node head,int n){
        Node temp = head;
        int count = 1;

        while(temp != null){
            if(count == n){
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return -1;
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
        int ans = nthNode(a,3);
        System.out.println(ans);
    }

}
