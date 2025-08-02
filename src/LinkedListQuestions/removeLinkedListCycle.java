package LinkedListQuestions;

public class removeLinkedListCycle {
    public static Node removeCycleFromLinkedList(Node head){
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

        Node ptr = temp;
        while (ptr.next != temp) {
            ptr = ptr.next;
        }
        ptr.next = null;

        return head;

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
        d.next = c;  // Creating a cycle


        // Remove cycle
        removeCycleFromLinkedList(a);

        // Print list to verify cycle is removed
        print(a);
    }
}
