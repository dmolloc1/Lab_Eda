
public class Node<E> {
    private E data;
    private int id;
    private Node<E> left;
    private Node<E> right;
    private static int cont = 0;
    // Constructores
    public Node(E data, Node<E> left, Node<E> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public Node(E data){
        this(data,null, null);
        /*Se le asigna un id aleatorio que el objeto tipo E no necesariamente es comparable
         y lo que se busca es almacenar datos por ello se usa el id para distribuir mejor el arbol 
        */
        cont ++;
        if(cont < 20){//Para que el arbol no quede necesariamente tan desvalanceado 
            this.id = (int)(Math.random()*(60) + 1);
        }else{
            this.id = (int)(Math.random()*(cont * 2) + 1);
        }
    }
   
    public void setLeft(Node<E> l){
        this.left = l;
    }
    public void setRight(Node<E> r){
        this.right = r;
    }
    public void setData(E d){
        this.data = d;
    }

    public Node<E> getRight(){
        return this.right;
    }

    public Node<E> getLeft(){
        return this.left;
    }

    public E getData(){
        return this.data;
    }
    public Integer getId(){
        return (Integer)this.id;
    }
}