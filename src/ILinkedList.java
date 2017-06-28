/**
 * @project: LinkedList
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/22/2017
 */
public interface ILinkedList<T> {

    public void appendToTail(T data);
    public Node deleteNode(Node head, T data);

}
