package Ejercicio2;

import java.util.EmptyStackException;

public class Cola<E> {
    private Pila<E> base, auxiliar;
    
    public Cola(){
        this.auxiliar = new Pila<>();
        this.base = new Pila<>();
    }

    public void enqueue(E x){
        base.push(x);
    }

    public E dequeue(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        while(!base.isEmpty()){
            auxiliar.push(base.pop());
        }

        E data = auxiliar.pop();

        while(!auxiliar.isEmpty()){
            base.push(auxiliar.pop());
        }
        return data;
    }

    public boolean isEmpty(){
        return this.base.isEmpty();
    }
    public String mostrar(){
        String text = "";
        for(String c:base.mostrar().split("")){
           text = c + text;
        }
        return text;
    }

    public static void main(String[] args) {
        Cola<Integer> c = new Cola<>();
        for(int i = 0; i < 10; i++){
            c.enqueue(i);
        }

        System.out.println("\n" + c.mostrar());
        c.dequeue();
        c.dequeue();
        System.out.println(c.mostrar());
        c.dequeue();
        c.dequeue();
        System.out.println(c.mostrar());

    }
}


