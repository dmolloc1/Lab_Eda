public class LinkedListInteger {
    private Node<Integer> head;

    public LinkedListInteger() {
        this.head = null;
    }

    //Método que inserta aleatoriamente un número entero positivo
    public void insertAleatory() {
        int num = (int)(Math.random() * 1000 + 1);//Este número siempre sera positivo
        insert(num);
    }

    protected void insert(Integer x) {
        Node<Integer> nod = new Node<>(x);

        if (this.head == null) {
            this.head = nod;
        } else {
            Node<Integer> pivot = this.head;
            while (pivot.getNext() != null) {
                pivot = pivot.getNext();
            }
            pivot.setNext(nod);
        }
    }
<<<<<<< HEAD
    public void insert (E x){
        Node<Integer> nod = new Node<>(x);

        if(isEmpty()){
           this.head = nod;
        }else{
            Node<Integer> pivot = this.head;
            while (pivot.getNext() != null) {
                pivot = pivot.getNext();
            }
            nod.setBack(pivot);
            nod.setNext(pivot.getNext());
            pivot.setNext(nod);
            

        }
    }
//Metodo para eliminar todos los elementos mayores que 
=======
    //Método que elimina todos los números mayores que
>>>>>>> 1ec5c434a0b5b361cab7111b94c978dd756f41ec
    public void removeGreaterThan(Integer x) {
        if (this.head == null) return;

        while (this.head != null && this.head.getData() > x) {
            this.head = this.head.getNext();
        }

        Node<Integer> pivot = this.head;
        while (pivot != null && pivot.getNext() != null) {
            if (pivot.getNext().getData() > x) {
                pivot.setNext(pivot.getNext().getNext());
            } else {
                pivot = pivot.getNext();
            }
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }
<<<<<<< HEAD

//Metodo para mostrar la lista
=======
//Método para mostrar la lista
>>>>>>> 1ec5c434a0b5b361cab7111b94c978dd756f41ec
    public String toString() {
        String str = "" + this.head.toString();
        Node<Integer> i = this.head;
        while(i.getNext() != null){
            str += ", " + i.getNext().toString() ;
            i = i.getNext();
        }
        return str;
    }

    public static void main(String[] args) {
        LinkedListInteger list = new LinkedListInteger();

        for(int i = 0; i < 10; i++){
            list.insertAleatory();
        }

        System.out.println("Lista original:");
        System.out.println(list.toString());

        list.removeGreaterThan(200);
        
        System.out.println("Lista después de eliminar valores mayores a 200:");
        System.out.println(list.toString());
    }
}
