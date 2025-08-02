package LinkedListQuestions;

class Node {
    int data;
    Node next;
    Node random;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class CustomLinkedList {
    Node head;

    /** Add at the end */
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /** Insert at the beginning */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /** Insert at a specific position (0-based index) */
    public void insertAtPosition(int index, int data) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Index out of range.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    /** Delete the first node */
    public Node deleteFirst() {
        if (head == null) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    /** Delete the last node */
    public Node deleteLast() {
        if (head == null) return null;
        if (head.next == null) {
            Node temp = head;
            head = null;
            return temp;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = null;
        return temp;
    }

    /** Delete node by position (0-based index) */
    public void deleteAtPosition(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) return;
        current.next = current.next.next;
    }

    /** Delete node by value */
    public void deleteByValue(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    /** Size of the list */
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /** Search an element */
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    /** Reverse list iteratively */
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public Node reverseRecursive(Node current) {
        if (current == null || current.next == null) {
            return current;
        }

        Node newHead = reverseRecursive(current.next); // Recursively reverse
        current.next.next = current; // Reverse the link
        current.next = null; // Break the original link

        return newHead;
    }

    /** Get middle node */
    public Node getMiddle() {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /** Print the list */
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printRecursively(Node temp) {
        if(temp == null){
            System.out.print("null");
            return;
        }
        System.out.print(temp.data + " -> ");
        printRecursively(temp.next);

    }

    public void revPrintRecursively(Node temp) {
        if(temp == null){
            return;
        }
        revPrintRecursively(temp.next);
        System.out.print(temp.data + " ");
    }

    /** Override toString() for easy printing */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

    /** Main method for testing */
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);  // 10 -> 20 -> 30 -> null

        list.insertAtBeginning(5);
        System.out.println("After inserting at beginning: " + list);

        list.insertAtPosition(2, 15);
        System.out.println("After inserting 15 at position 2: " + list);

        list.deleteFirst();
        System.out.println("After deleting first: " + list);

        list.deleteLast();
        System.out.println("After deleting last: " + list);

        list.deleteByValue(20);
        System.out.println("After deleting value 20: " + list);

        list.reverse();
        System.out.println("After reversing: " + list);

        System.out.println("Size of list: " + list.size());
        System.out.println("Search 15? " + list.search(15));
        System.out.println("Middle element: " + (list.getMiddle() != null ? list.getMiddle().data : "None"));

        System.out.print("Recursive print: ");
        list.printRecursively(list.head);
        System.out.println();
        System.out.print("Recursive print: ");
        list.revPrintRecursively(list.head);
        System.out.println();



    }
}
