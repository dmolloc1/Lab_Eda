package Ejercicio2;
import arbol.ArbolBinario;
import arbol.Node;

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

    public static void main(String[] args) {
        ArbolBinario2<Integer> b2 = new ArbolBinario2<>();

        b2.add(3);
        b2.add(4);
        b2.add(6);
        b2.add(8);
        b2.add(30);
        b2.add(40);
        b2.add(60);
        b2.add(80);

        System.out.println("Altura: " + b2.height());

    }
}
