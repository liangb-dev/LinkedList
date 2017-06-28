/**
 * @project: LinkedList
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/22/2017
 *
 * Concepts: Generics,
 * Data structures: Nodes, Singly Linked lists,
 */
public class LinkedList<T> implements ILinkedList<T> {

    public Node<T> head;

    public LinkedList(T data) {
        head.setData(data);
    }

    /**
     * AppendToTail: appends a Node with given data to tail of linked list
     * @param data
     * @return void
     */
    public void appendToTail(T data) {
        Node end = new Node(data);
        Node nd = this.head.getNext();
        while (this.head.getNext() != null) {
            nd = nd.getNext();
        }
        nd.setNext(end);
    }

    /**
     * deleteNode: deletes next Node with given data
     * @param head
     * @param data
     * @return Node
     */
    public Node deleteNode(Node head, T data) {
        Node nd = head;

        // if head is target Node
        if (nd.getData() == data) {
            return head;
        }

        // while !end of list
        while (nd.getNext() != null) {
            // if next Node is target Node
            if (nd.getNext().getData() == data) {
                // if target Node has next Node
                if (nd.getNext().getNext() != null) {
                    nd.setNext(nd.getNext().getNext()); // set next.next
                } else {
                    nd.setNext(null); // else set as null
                }
                return head; //return
            }

            nd.setNext(nd.getNext()); // increment next Node
        }
        return head; // return

    }

}
