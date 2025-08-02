package LinkedListQuestions;

public class LinkedListCycle2 {
    public static Node linkedListCycleBeginNode(Node head){
        if(head == null || head.next == null) return null;
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return  null;
        }
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
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
        a.next = b;
        b.next = c;
        c.next = d;

        d.next = c;

        Node ans = linkedListCycleBeginNode(a);
        if (ans != null) {
            System.out.println("Cycle starts at node: " + ans.data);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
