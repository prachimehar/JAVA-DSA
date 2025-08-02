package LinkedListQuestions;

import java.util.HashMap;

public class CopyListwithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Create new nodes and store mapping
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        // Step 2: Assign next and random pointers
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}