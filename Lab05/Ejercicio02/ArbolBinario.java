import java.util.ArrayList;

public class ArbolBinario <E> {
    private Node<E> root;
    ArrayList <String> tree;
    private int cant;

    public ArbolBinario() {
        this.root = null;
        this.tree = new ArrayList<>();
        this.cant = 0;
    }
    
    public E get() {
        return this.root.getData();
    }

    public void insert(E x) {
        Node <E> aux = new Node<E>(x);
        if(this.root == null){
            this.root = aux;
        }else{
            this.root = insertNode(aux, this.root);
        }
    }

    // Protected insertNode method
    protected Node<E> insertNode(Node<E> aux, Node<E> actual){
        if (actual == null) {
            actual = aux;
        } else {
            int res = actual.getId().compareTo(aux.getId());
            if (res > 0) {
                actual.setLeft(insertNode(aux, actual.getLeft()));
            } else {
                actual.setRight(insertNode(aux, actual.getRight()));
            }
        }
        return actual;
    }
    public String toString(){
        tree.clear();
        cant = 0;
        toLevelsTree(this.root, 0);
        String str="Cantidad de nodos: " + cant + "\n";
        for(int i = 1; i <= tree.size(); i++){
            str += "Nivel " + i + ": " + tree.get(i - 1) + "\n" ;
        }
        return str;
    }
    protected void toLevelsTree(Node<E> actual, int i){
        if(actual != null){
            if (tree.size() <= i) {
                tree.add(""); 
            }
            cant += 1;
            tree.set(i, tree.get(i) + actual.getId() + " ");

            toLevelsTree(actual.getLeft(), i + 1);
            toLevelsTree(actual.getRight(), i + 1);
        }
    }


}
