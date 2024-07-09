package Ejercicio2;
import arbol.*;

public class ArbolBinario2<E extends Comparable<E>> extends ArbolBinario<E> {
    public ArbolBinario2 (){
        super();
    }
    public int height(){
        return heightTree(this.root);
    }
    private int heightTree(Node <E> actual){
        if(actual == null){
            return 0;
        }else{
            int der = heightTree(actual.getRight());
            int izq = heightTree(actual.getLeft());

            return Math.max(der, izq) + 1;
        }
    }
}
