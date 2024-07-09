package Ejercicio4;
import arbol.*;

public class ArbolBinario4<E extends Comparable<E>> extends ArbolBinario<E> {
    public ArbolBinario4 (){
        super();
    }

    public int contar() {
        return contarTree(this.root);
    }

    private int contarTree(Node<E> actual) {
        if (actual == null) {
            return 0;
        }else{
            return contarTree(actual.getLeft()) + 1 + contarTree(actual.getRight());
        }   
    }
}


