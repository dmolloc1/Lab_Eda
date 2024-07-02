package Ejercicio2;

public class Node<E> {
    private E data;
    private Node<E> next;

    // Constructors
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node(E data) {
        this(data, null);
    }

    // Getters and setters
    public void setNext(Node<E> l) {
        this.next = l;
    }

    public void setData(E d) {
        this.data = d;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public E getData() {
        return this.data;
    }
}
