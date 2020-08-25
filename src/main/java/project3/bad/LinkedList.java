package project3.bad;

public class LinkedList {

    public static class Node {
        public String value;
        public Node next;
    }

    public Node head;

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;
        if(head == null) {
            head = newNode;
        } else {
            head.next = newNode;
        }
    }

    public String get(int index) {
        Node whichNode = head;
        for(int i = 0; i < index; i++) {
            whichNode = whichNode.next;
        }
        return whichNode.value;
    }

    public int size() {
        Node whichNode = head;
        int i = 0;
        while(whichNode.next != null) {
            i++;
            whichNode = whichNode.next;
        }
        return i;
    }
}
