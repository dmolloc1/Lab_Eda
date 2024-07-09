package Ejercicio1;
import arbol.*;

public class ArbolBinario1<E extends Comparable<E>> extends ArbolBinario<E> {
    public ArbolBinario1 (){
        super();
    }
//Método InOrden
    public String inOrder(){
        return inOrderTree(this.root);
    }
    private String inOrderTree(Node <E> actual){
        if(actual == null){
            return "";
        }else{
            return inOrderTree(actual.getLeft()) + actual.getData() + " " + inOrderTree(actual.getRight());
        }
    }
//Método PreOrden
    public String preOrder(){
        return preOrderTree(this.root);
    }
    private String preOrderTree(Node <E> actual){
        if(actual == null){
            return "";
        }else{
            return actual.getData() + " " + preOrderTree(actual.getLeft()) + preOrderTree(actual.getRight());
        }
    } 

//Método PostOrden
    public String postOrder(){
        return postOrderTree(this.root);
    }

    private String postOrderTree(Node <E> actual){
        if(actual == null){
            return "";
        }else{
            return postOrderTree(actual.getLeft()) + postOrderTree(actual.getRight()) + actual.getData() + " " ;
        }
    }

    public static void main(String[] args) {
        //Métodos para mostrar un árbol binario inorden, preorden, postorden
        ArbolBinario1<Integer> b1 = new ArbolBinario1<>();

        b1.add(3);
        b1.add(4);
        b1.add(6);
        b1.add(8);
        b1.add(30);
        b1.add(40);
        b1.add(60);
        b1.add(80);
        System.out.println(b1.inOrder());
        System.out.println(b1.preOrder());
        System.out.println(b1.postOrder());

    }
}
