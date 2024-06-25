/*
Implementación de lista enlazada
• Implementa una lista enlazada simple que permite agregar elementos al final y mostrar todos los
elementos de la lista.
• Añade un método a la clase ListaEnlazada para eliminar un nodo específico de la lista enlazada.
• Añade un método a la clase ListaEnlazada para buscar un nodo específico en la lista enlazada. 
 */

 public class LinkedList<E> {
    private Node<E> head;

    public LinkedList(){
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
            insertFirst(x);
        }
    }

    public void insertFirst(E x){
        this.head = new Node<E>(x, this.head); 
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
    public void remove( E x ){
        if(!isEmpty()){
            Node <E> pivot = this.head;
            if (pivot.getData().equals(x))  {
                this.head = this.head.getNext();
            }
            while(pivot.getNext() != null &&  !pivot.getNext().getData().equals(x) ){
                pivot = pivot.getNext();
            }
            if(pivot.getNext() != null){
                pivot.setNext(pivot.getNext().getNext());
            }
        }
    }
    public boolean isEmpty(){
        return this.head ==  null;
    }

    public String toString() {
        String str = "";
        Node<E> i = this.head;
        for (; i != null; i = i.getNext()) {
          str += i.toString() + ", ";
        }
        return str;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.insert(3);
        l1.insert(1);
        l1.insert(4);
        l1.insert(5);
        l1.insert(7);
        l1.insert(9);

        l1.insert(100);

        System.out.println(l1.toString());
        l1.remove(1);
        System.out.println(l1.toString());
        l1.remove(100);
        System.out.println(l1.toString());
        l1.remove(3);
        System.out.println(l1.toString());
        System.out.println("Se busca el 9 ? " + l1.search(9));
        System.out.println("Se busca el 44 ? " + l1.search(44));

    }
}
