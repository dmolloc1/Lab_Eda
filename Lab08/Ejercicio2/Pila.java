package Ejercicio2;


import java.util.EmptyStackException;

public class Pila<E> {
    private Node<E> top;

    public Pila(){
        this.top = null;
    }

    public void push(E data) {
        Node<E> newNod = new Node<>(data);
        newNod.setNext(this.top);
        this.top = newNod;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        
        E data = this.top.getData();
        this.top = this.top.getNext();

        return data;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String mostrar() {
        Node<E> actual = this.top;
        String text = "";
        while (actual != null) {
            text += actual.getData();
            actual = actual.getNext();
        }
        return text;
    }

}
