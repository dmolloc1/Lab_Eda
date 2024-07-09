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

//Método PostOrden;
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
}
