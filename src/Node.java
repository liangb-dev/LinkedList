/**
 * @project: LinkedList
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/22/2017
 */
public class Node<T> {
    private T data;
    private Node next;
    private Node prev;

    // Constructor w/ data
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    // Constructor customized
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }


    public void setFields(T data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public void setData(T data) {
        this.data = data;
    }

    public T getData() { return this.data; }
    public Node getNext() {return this.next; }
    public Node getPrev() {return this.prev; }

}

