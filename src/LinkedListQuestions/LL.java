package LinkedListQuestions;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size +=1;

    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size ++;
    }

    public void insertAtIndex(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;

        size++;

    }

    public int delete(int index ){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        return value;

    }

    public Node find(int value){
        Node newNode = head;
        while(newNode != null){
            if(newNode.val == value){
                return newNode;
            }
            newNode = newNode.next;
        }
        return null;
    }

    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return value;
    }

    public Node deleteLast1(){
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public int deleteLast(){
        if(size <=1 ){
            return deleteFirst();
        }
        Node secLast = get(size-2);
        int value = tail.val;
        tail = secLast;
        tail.next = null;
        return value;
    }

    public Node get(int index){
        Node newNode = head;
        for (int i = 0; i < index; i++) {
            newNode = newNode.next;
        }

        return newNode;
    }
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    // insert using recursion
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }

    private Node insertRec(int val,int index ,Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec(val,index-1,node.next);
        return node;
    }

    // remove duplicate from sorted list
    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;

    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);
        list.display();
        list.duplicate();
        list.display();
    }
}
