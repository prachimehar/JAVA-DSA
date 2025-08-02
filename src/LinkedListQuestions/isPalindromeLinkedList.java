package LinkedListQuestions;

public class isPalindromeLinkedList {
    public static boolean isPalindrome(Node head) {
        Node slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = reverseList(slow.next);
        Node p1 = head;
        Node p2 = temp;

        while(p2 != null){
            if(p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static Node reverseList(Node head) {
        Node node = null;
        while (head != null) {
            Node temp = head.next;
            head.next = node;
            node = head;
            head = temp;
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
        Node e = new Node(2);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        print(a);
        boolean ans = isPalindrome(a);
        System.out.println(ans);

    }
}
