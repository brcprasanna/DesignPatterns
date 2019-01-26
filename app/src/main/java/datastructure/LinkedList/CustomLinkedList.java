package datastructure.LinkedList;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public class CustomLinkedList<T extends Comparable<T>> {
    private Node<T> head = null;

    /**
     * [0][1] -> [1][2] -> [2][3]
     * @param data
     */
    public void add(T data) {
        if (head == null) {
            head = new Node<T>(data);
        }
        else {
            Node<T> current = head;
            while (current != null) {
                current = current.next;
            }
            current.setNext(new Node<T>(data));
        }
    }

    public T remove() {
        if (head != null) {
            T data = head.data;
            Node<T> current = head.next;
            head = head.getNext();
            return data;
        }
        return null;
    }

    public int size() {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            current = current.getNext();
            count++;
        }
        return count;
    }

}
