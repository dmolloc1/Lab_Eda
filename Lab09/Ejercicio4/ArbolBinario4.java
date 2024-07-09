package Ejercicio4;
import Ejercicio3.ArbolBinario3;
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

    public static void main(String[] args) {
        ArbolBinario4<Integer> b = new ArbolBinario4<>();

        b.add(5);
        b.add(3);
        b.add(8);
        b.add(1);
        b.add(4);
        b.add(6);
        b.add(9);
        

        System.out.println("\nNúmero de nodos " +b.contar());

    }
}


