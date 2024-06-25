package Ejercicio2;

public class LinkedListNumbers <E extends Integer>{
    private Node<E> head;
    public LinkedListNumbers(){
        this.head = null;
    }
    public void insert(E x){
        if(!isEmpty()){
            Node <E> pivot = this.head;
            while(pivot.getNext() != null ){
                pivot  =  pivot.getNext();
            }
            pivot.setNext(new Node<E>(x));
        }else{
            this.head = new Node<E>(x, this.head); 
        }
    }
    
    public E search(E x){
        if(isEmpty()) return null;
        Node <E> pivot = this.head;

        while( !pivot.getData().equals(x) && pivot.getNext() != null){
            pivot = pivot.getNext();
        }
        
        if(pivot.getData().equals(x)) return pivot.getData();
        return null;
    }
    public void removeGreaterThan( E x ){
        if(!isEmpty()){
            Node <E> pivot = this.head;
            if (pivot.getData().compareTo(x) > 0)  {
                this.head = this.head.getNext();
            }
            while(pivot.getNext() != null ){
                if(pivot.getNext().getData().compareTo(x) > 0){
                    pivot.setNext(pivot.getNext().getNext());
                }
                pivot = pivot.getNext();
            }
        }
    }

    public boolean isEmpty(){
        return this.head ==  null;
    }

    //Metodo que recorre la lista para mostrar los elementos por pantalla
    public String toString() {
        String str = "";
        Node<E> i = this.head;
        for (; i != null; i = i.getNext()) {
          str += i.toString() + ", ";
        }
        return str;
    }
}
