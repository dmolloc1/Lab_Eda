package ejercicio2;

import java.util.ArrayList;

public class ArbolBinario <E> {
    private Node<E> root;
    ArrayList <String> tree;

    public ArbolBinario() {
        this.root = null;
        this.tree = new ArrayList<>();
    }
    
    public E get() {
        return this.root.getData();
    }

    public void insert(E x) {
        if(this.root == null){
            this.root = new Node<E>(x);
        }else{
            insertNode(x, this.root);
        }
    }

    // Protected insertNode method
    protected Node<E> insertNode(E x, Node<E> actual){
        if(actual.getLeft() == null){
            actual.setLeft(insertNode(x, actual.getLeft()));
        }else{
            actual.setRight(insertNode(x, actual.getRight()));
        }
        return actual;
    }

    public String toLevels(){
        tree.clear();
        toLevelsTree(this.root, 0);
        String str="";
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
            tree.set(i, tree.get(i) + actual.getData() + " ");
            toLevelsTree(actual.getLeft(), i + 1);
            toLevelsTree(actual.getRight(), i + 1);
        }
    }
}
