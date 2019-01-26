package datastructure.LinkedList;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
