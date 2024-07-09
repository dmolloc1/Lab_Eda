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
                der = actual.getLeft().getData().compareTo(actual.getData()) > 0; 
            }else{
                isBST(actual.getLeft());
            }
            return izq && der;
        }

    }
}
