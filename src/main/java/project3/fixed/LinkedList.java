package project3.fixed;

/**
 * Simple implementation of a Linked List, which provides an add, get, and size method.
 * Does not implement the List interface for simplicity.
 * Singly-linked only.
 *
 * @param <T>   Data type stored in Linked List
 */
public class LinkedList<T> {

    /**
     * Internal node class to store a value and the next node
     *
     * @param <T> Data type stored in Linked List
     */
    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    private Node<T> head;
    private int size;

    /**
     * Makes a new, empty LinkedList.
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Adds the value to the list.
     *
     * @param value Value to add
     */
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if(head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    /**
     * Gets the value at the index.
     *
     * @param index Index to get value from
     * @return      Value stored in list, or null if invalid index
     */
    public T get(int index) {
        if(index >= size || index < 0) {
            return null;
        }
        Node<T> currentNode = head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    /**
     * Returns size of list
     *
     * @return  Size of list (number of elements)
     */
    public int size() {
        return size;
    }
}
