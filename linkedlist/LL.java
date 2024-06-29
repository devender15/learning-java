package linkedlist;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int value, int index) {
        if(index==0) {
            insertFirst(value);
            return;
        } if(index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size+=1;
    }

    // insertion using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size += 1;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    private void reverse(Node node) {
        if(node==tail) {
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse() {
        if(size<2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public Node reverseBetween(Node head, int left, int right) {
        if(left == right) {
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newEnd = current;

        // reverse
        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null) {
                next = next.next;
            }
        }

        if(last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
    }

    public void deleteFirst() {
        head = head.next;
        if(head==null) {
            tail = null;
        }
        size-=1;
    }

    public void deleteLast() {
        tail = get(size-2);
        tail.next = null;
    }

    public void deleteAt(int index) {
        if(index == 0) deleteFirst();
        if(index == size) deleteLast();
        else {
            Node node = get(index-1);
            node.next = get(index+1);
        }
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value) return node;
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
