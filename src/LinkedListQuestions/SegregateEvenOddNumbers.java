package LinkedListQuestions;

public class SegregateEvenOddNumbers {

    // Segregate even and odd such that first all even list and then all odd and also preserve their original order

    public static Node evenOdd(Node head){
        if(head == null || head.next == null) return null;

        Node evenS = null, evenE = null;
        Node oddS = null, oddE = null;

        Node curr = head;
        while(curr != null){
            int val = curr.data;
            if(val % 2 ==0){
                if(evenS == null){
                    evenS = curr;
                    evenE = evenS;
                }
                else{
                    evenE.next = curr;
                    evenE = evenE.next;
                }
            }
            else{
                if(oddS == null){
                    oddS = curr;
                    oddE = oddS;
                }
                else{
                    oddE.next = curr;
                    oddE = oddE.next;
                }
            }
            curr = curr.next;
        }

        if(evenS == null) return oddS;
        if(oddS == null) return evenS;

        evenE.next = oddS;
        oddE.next = null;

        return evenS;
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
        evenOdd(a);
        print(a);
    }
}
