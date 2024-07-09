package Ejercicio3;
import arbol.*;

public class ArbolBinario3<E extends Comparable<E>> extends ArbolBinario<E> {
    public ArbolBinario3 (){
        super();
    }

    public boolean isBST(){
        return isBST(this.root);
    }
    private boolean isBST(Node<E> actual){
        if(actual == null){
            return true;
        }else{
            boolean izq = true;
            boolean der = true;

            if (actual.getLeft() != null) {
                izq = actual.getLeft().getData().compareTo(actual.getData()) <= 0; 
            }else{
                isBST(actual.getRight());
            }

            if(actual.getRight() != null){
                der = actual.getRight().getData().compareTo(actual.getData()) > 0; 
            }else{
                isBST(actual.getLeft());
            }
            return izq && der;
        }

    }

    public static void main(String[] args) {
        ArbolBinario3<Integer> b = new ArbolBinario3<>();

        b.add(5);
        b.add(3);
        b.add(8);
        b.add(1);
        b.add(4);
        b.add(6);
        b.add(9);
        

        System.out.println(b.isBST());

    }
}
